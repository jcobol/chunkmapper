package com.chunkmapper.writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.chunkmapper.Point;
import com.mojang.nbt.CompoundTag;
import com.mojang.nbt.DoubleTag;
import com.mojang.nbt.ListTag;
import com.mojang.nbt.NbtIo;

public class LoadedLevelDat {
	private final CompoundTag data;
	public final File store;

	public LoadedLevelDat(File loadedLevelDatFile) throws IOException {
		this.store = loadedLevelDatFile;
		CompoundTag data;
			InputStream in = new BufferedInputStream(new FileInputStream(store));
			data = NbtIo.readCompressed(in);
			in.close();
		this.data = data;
	}
	public void save() throws IOException {
		OutputStream out = new BufferedOutputStream(new FileOutputStream(store));
		NbtIo.writeCompressed(data, out);
		out.close();
	}
	public void setPlayerPosition(double x, double y, double z) {
		System.out.println("setting player position to " + x + ", " + y + ", " + z);
		CompoundTag Data = data.getCompound("Data");
		Data.putInt("SpawnX", (int) x);
		Data.putInt("SpawnY", (int) y);
		Data.putInt("SpawnZ", (int) z);
		CompoundTag Player = Data.getCompound("Player");
		Player.putInt("SpawnX", (int) x);
		Player.putInt("SpawnY", (int) y);
		Player.putInt("SpawnZ", (int) z);

		ListTag<DoubleTag> Pos = new ListTag<DoubleTag>("Pos");
		Pos.add(new DoubleTag("", x));
		Pos.add(new DoubleTag("", y));
		Pos.add(new DoubleTag("", z));
		Player.put("Pos", Pos);
	}
	public Point getPlayerPosition() {
		CompoundTag Data = data.getCompound("Data");
		CompoundTag Player = Data.getCompound("Player");
		ListTag<DoubleTag> Pos = (ListTag<DoubleTag>) Player.getList("Pos");
		double x = Pos.get(0).data;
		double z = Pos.get(2).data;
		return new Point((int) x, (int) z);
	}
	public void setName(String name) {
		System.out.println("setting player name");
		CompoundTag Data = data.getCompound("Data");
		Data.putString("LevelName", name);
	}
	public String getGameName() {
		CompoundTag Data = data.getCompound("Data");
		return Data.getString("LevelName");
	}
}
