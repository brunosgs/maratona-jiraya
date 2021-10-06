package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo01equalshashcode.dominio.Smartphone;

public class ListTest02 {

	public static void main(String[] args) {
		Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
		Smartphone smartphone2 = new Smartphone("22222", "Pixel");
		Smartphone smartphone3 = new Smartphone("33333", "Samsung");

		List<Smartphone> smartphones = new ArrayList<>(6);
		smartphones.add(smartphone1);
		smartphones.add(smartphone2);
		smartphones.add(0, smartphone3);

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}

		Smartphone smartphone4 = new Smartphone("33333", "Samsung");
		System.out.println(smartphones.contains(smartphone4));

		int indexSmartphone4 = smartphones.indexOf(smartphone4);
		System.out.println(smartphones.get(indexSmartphone4));

	}

}
