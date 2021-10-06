package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class ListTest04Sorting02 {
	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);

		mangas.add(new Manga(5L, "Attack on titan", 19.90));
		mangas.add(new Manga(7L, "Berserk", 9.36));
		mangas.add(new Manga(4L, "Hellsing Ultimate", 11.20));
		mangas.add(new Manga(2L, "Pokemon", 2.99));
		mangas.add(new Manga(3L, "Dragon ball Z", 3.59));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Collections.sort(mangas);
		System.out.println("\n----------------------------------------------\n");

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

//		mangas.sort(new MangaByIdComparator()); É possivel dessa forma também!
		Collections.sort(mangas, new MangaByIdComparator());
		System.out.println("\n----------------------------------------------\n");

		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}
}

class MangaByIdComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga m1, Manga m2) {
		return m1.getId().compareTo(m2.getId());
	}

}
