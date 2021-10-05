package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class ListTest03Sorting01 {

	public static void main(String[] args) {
		List<String> mangas = new ArrayList<>(6);
		List<Double> valores = new ArrayList<>();

		mangas.add("Attack on titan");
		mangas.add("Berserk");
		mangas.add("Hellsing Ultimate");
		mangas.add("Pokemon");
		mangas.add("Dragon ball Z");

		System.out.println("S/ Ordenação: " + mangas);
		Collections.sort(mangas);
		System.out.println("C/ Ordenação: " + mangas);
		System.out.println("---------------------------------------");

		valores.add(100.21);
		valores.add(23.98);
		valores.add(21.21);
		valores.add(98.13);

		System.out.println("S/ Ordenação: " + valores);
		Collections.sort(valores);
		System.out.println("C/ Ordenação: " + valores);

		new Manga(null, null, 0);
	}

}
