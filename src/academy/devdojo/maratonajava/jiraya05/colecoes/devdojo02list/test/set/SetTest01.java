package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.set;

import java.util.LinkedHashSet;
import java.util.Set;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class SetTest01 {

	public static void main(String[] args) {
		Set<Manga> mangas = new LinkedHashSet<>();

		mangas.add(new Manga(5L, "Attack on titan", 19.90, 0));
		mangas.add(new Manga(7L, "Berserk", 9.36, 4));
		mangas.add(new Manga(4L, "Hellsing Ultimate", 11.20, 0));
		mangas.add(new Manga(2L, "Pokemon", 2.99, 2));
		mangas.add(new Manga(3L, "Dragon ball Z", 3.59, 0));
		mangas.add(new Manga(3L, "Dragon ball Z", 3.59, 0));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}
