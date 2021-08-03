package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {

	public static void main(String[] args) {
		File file = new File("arquivo\\file.txt");

		try {
			boolean isCreated = file.createNewFile();
			System.out.println("Created: " + isCreated);
			System.out.println("Path: " + file.getPath());
			System.out.println("Path absolute: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Is file: " + file.isFile());
			System.out.println("Is hidden: " + file.isHidden());
			System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());

			boolean exists = file.exists();

			if (exists) {
				System.out.println("Deleted: " + file.delete());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
