package com.chunkmapper.writer;

import java.io.DataOutputStream;
import java.io.File;

import net.minecraft.world.level.chunk.storage.RegionFile;

import com.chunkmapper.GameMetaInfo;
import com.chunkmapper.MappedSquareManager;
import com.chunkmapper.Point;
import com.chunkmapper.PointManager;
import com.chunkmapper.Tasker;
import com.chunkmapper.chunk.Chunk;
import com.chunkmapper.downloader.UberDownloader;
import com.chunkmapper.manager.GlobcoverManager;
import com.chunkmapper.multiplayer.MPPointManager;
import com.mojang.nbt.NbtIo;

//A region Writer without prioritizing by position
public class NeutralRegionWriter extends Tasker {
	public static final int NUM_WRITING_THREADS = Runtime.getRuntime().availableProcessors() + 1;
	public final Point rootPoint;
	public final File regionFolder;
	private final UberDownloader uberDownloader;
	private final GameMetaInfo gameMetaInfo;
	private final MPPointManager pointManager;
	private final int verticalExaggeration;
	private final MappedSquareManager mappedSquareManager;

	public NeutralRegionWriter(MPPointManager pointManager, Point rootPoint, File regionFolder, 
			GameMetaInfo metaInfo, UberDownloader uberDownloader, int verticalExaggeration, MappedSquareManager mappedSquareManager) {
		super(NUM_WRITING_THREADS);
		this.mappedSquareManager = mappedSquareManager;
		this.verticalExaggeration = verticalExaggeration;
		this.rootPoint = rootPoint;
		this.regionFolder = regionFolder;
		this.uberDownloader = uberDownloader;
		this.gameMetaInfo = metaInfo;
		this.pointManager = pointManager;
	}

	public void addRegion(int regionx, int regionz) {
		super.addTask(regionx, regionz);
		//always try, and try again buddy
	}
	@Override
	protected void doTask(Point task) throws Exception {
		int a = task.x, b = task.z;
		int regionx = task.x + rootPoint.x, regionz = task.z + rootPoint.z;

		File f = new File(regionFolder, "r." + a + "." + b + ".mca");
		GlobcoverManager coverManager = new GlobcoverManager(regionx, regionz, uberDownloader, verticalExaggeration);

		if (coverManager.allWater) {
			pointManager.updateStore(task);
			mappedSquareManager.addPoint(new Point(task.x + rootPoint.x, task.z + rootPoint.z));
			return;
		}

		RegionFile regionFile = new RegionFile(f);

		//
		for (int x = 0; x < 32; x++) {
			for (int z = 0; z < 32; z++) {
				if (Thread.interrupted()) {
					regionFile.close();
					f.delete();
					throw new InterruptedException();
				}
				Chunk chunk = coverManager.getChunk(x + regionx*32, z + regionz*32, x + a*32, z + b*32);
				DataOutputStream stream = regionFile.getChunkDataOutputStream(x, z);
				NbtIo.write(chunk.getTag(), stream);
				stream.close();
			}
		}
		regionFile.close();


		pointManager.updateStore(task);
		gameMetaInfo.incrementChunksMade();
		mappedSquareManager.addPoint(new Point(task.x + rootPoint.x, task.z + rootPoint.z));
	}

}
