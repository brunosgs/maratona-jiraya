package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

	public static void main(String[] args) {
		Path p1 = Paths.get("/MaratonaJava/pasta2/arquivo.txt");
		Path p2 = Paths.get("/MaratonaJava/pasta2/", "arquivo.txt");
		Path p3 = Paths.get("C", "Users\\bruno\\Documents\\CURSOS\\workspace\\ws-devdojo\\MaratonaJava\\pasta2", "arquivo.txt");
		Path p4 = Paths.get("MaratonaJava", "pasta2", "arquivo.txt");

		System.out.println("Path 1: " + p1.getFileName());
		System.out.println("Path 2: " + p2.getFileName());
		System.out.println("Path 3: " + p3.getFileName());
		System.out.println("Path 4: " + p4.getFileName());
	}

}
