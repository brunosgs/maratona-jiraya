package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {

	public static void main(String[] args) {
		File file = new File("arquivo\\file.txt");

		try (FileWriter fileWriter = new FileWriter(file, true)) {
			fileWriter.write("Curso DevDojo, escrevendo em arquivos!");
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
