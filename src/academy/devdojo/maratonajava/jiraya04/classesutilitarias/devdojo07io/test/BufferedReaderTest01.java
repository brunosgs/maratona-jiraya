package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {

	public static void main(String[] args) {
		File file = new File("arquivo\\file2.txt");

		try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
