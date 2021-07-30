package academy.devdojo.maratonajava.jiraya03.exception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.maratonajava.jiraya03.exception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.jiraya03.exception.exception.dominio.Leitor2;

public class TryWithResourcesTest01 {

	public static void main(String[] args) {
		lerArquivo();
		lerArquivo2();
		lerArquivo3();
	}

	private static void lerArquivo() {
		try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
		} catch (IOException e) {
		}

	}

	// Só é possível adicionar em um tryWithResources caso a classe implemente
	// Closeable ou AutoCloseable
	private static void lerArquivo2() {
		try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

		} catch (IOException e) {
		}

	}

	public static void lerArquivo3() {
		Reader reader = null;

		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
