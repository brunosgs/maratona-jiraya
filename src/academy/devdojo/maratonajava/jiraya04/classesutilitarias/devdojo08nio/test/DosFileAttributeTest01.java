package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("pasta/dos_file_attribute.txt");

		if (Files.notExists(path)) {
			Files.createFile(path);
		}

//		Files.setAttribute(path, "dos:hidden", true);
//		Files.setAttribute(path, "dos:readonly", true);

		DosFileAttributes dosReadAttributes = Files.readAttributes(path, DosFileAttributes.class);

		System.out.println(dosReadAttributes.isHidden());
		System.out.println(dosReadAttributes.isReadOnly());

		DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

		dosFileAttributeView.setHidden(false);
		dosFileAttributeView.setReadOnly(false);

		System.out.println(dosFileAttributeView.readAttributes().isHidden());
		System.out.println(dosFileAttributeView.readAttributes().isReadOnly());
	}

}
