package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

	public static void main(String[] args) {
		File file = new File("arquivo\\file2.txt");

		try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 2048)) {
			bufferedWriter.write("Curso DevDojo, escrevendo em arquivos!");
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
