package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo14interfaces.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo14interfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo14interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo14interfaces.dominio.FileLoader;

public class DataloaderTest {

	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();

		databaseLoader.load();
		databaseLoader.remove();
		databaseLoader.checkPermission();

		fileLoader.load();
		fileLoader.remove();
		databaseLoader.checkPermission();

		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();
	}

}
