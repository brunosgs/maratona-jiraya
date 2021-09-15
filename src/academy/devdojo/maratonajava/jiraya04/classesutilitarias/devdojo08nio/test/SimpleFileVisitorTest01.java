package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest01 {

	public static void main(String[] args) throws IOException {
		Path root = Paths.get("");

		Files.walkFileTree(root, new ListJavaFiles());
	}

}

class ListJavaFiles extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if (file.getFileName().toString().endsWith(".java")) {
			System.out.println(file.getFileName().toString());
		}

		return FileVisitResult.CONTINUE;
	}
}
