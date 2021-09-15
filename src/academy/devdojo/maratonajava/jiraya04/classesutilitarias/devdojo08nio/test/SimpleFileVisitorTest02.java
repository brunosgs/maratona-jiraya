package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest02 {

	public static void main(String[] args) throws IOException {
		Path root = Paths.get("pasta");

		Files.walkFileTree(root, new ListAllFiles());
	}
}

class ListAllFiles extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName().toString());

		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("Pre visit: " + dir.getFileName());

		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return super.visitFileFailed(file, exc);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Post visit: " + dir.getFileName());

		return FileVisitResult.CONTINUE;
	}

}
