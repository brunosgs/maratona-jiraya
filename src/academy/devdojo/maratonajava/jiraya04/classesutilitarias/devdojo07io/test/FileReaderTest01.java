package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

	public static void main(String[] args) {
		File file = new File("arquivo\\file.txt");

		try (FileReader fileReader = new FileReader(file)) {
//			int i;
//
//			while ((i = fileReader.read()) != -1) {
//				System.out.print((char) i);
//			}

			char[] in = new char[100];

			int size = fileReader.read(in);
			System.out.println(size);

			for (char c : in) {
				System.out.print(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
