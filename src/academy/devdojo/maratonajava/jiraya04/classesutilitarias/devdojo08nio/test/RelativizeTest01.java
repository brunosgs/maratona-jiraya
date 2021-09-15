package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {

	public static void main(String[] args) {
		Path absolutoDir = Paths.get("/home/bruno");
		Path absolutoDirClass = Paths.get("/home/bruno/devdojofoda/OlaMundo.java");
		Path pathToClass = absolutoDir.relativize(absolutoDirClass);

		System.out.println(pathToClass + "\n\n");

		Path absoluto1 = Paths.get("/home/bruno");
		Path absoluto2 = Paths.get("/user/local");
		Path absoluto3 = Paths.get("/home/bruno/devdojofoda/OlaMundo.java");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/temp.20210907");

		System.out.println("1 - " + absoluto1.relativize(absoluto3));
		System.out.println("2 - " + absoluto3.relativize(absoluto1));
		System.out.println("3 - " + absoluto1.relativize(absoluto2));
		System.out.println("4 - " + relativo1.relativize(relativo2));
		// Cuidar com caminhos que partam do absoluto para o relativo.
		System.out.println("5 - " + absoluto1.relativize(relativo1));
	}

}
