package com.chunkmapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptions {
	public static void checkFile(File f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		int i = 0;
		String line;
		boolean lineHasCatch = false;
		while ((line = br.readLine()) != null) {
			if (lineHasCatch && line.indexOf("printStackTrace()") == -1) {
				System.out.println(f.getName() + " " + i + ": " + line);
			}
			lineHasCatch = line.indexOf("catch") != -1;
			i++;
		}
		br.close();
	}
	public static void checkAllFiles(File f) throws IOException {
		for (File g : f.listFiles()) {
			if (g.getName().endsWith(".java")) {
				checkFile(g);
			}
			if (g.isDirectory())
				checkAllFiles(g);
		}
	}
	public static void main(String[] args) throws Exception {
		File f = new File("/Users/matthewmolloy/workspace/chunkmapper2/src/");
		checkAllFiles(f);
	}


}