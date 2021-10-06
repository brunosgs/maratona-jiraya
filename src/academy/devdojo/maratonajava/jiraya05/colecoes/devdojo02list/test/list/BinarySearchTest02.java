package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class BinarySearchTest02 {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

		mangas.add(new Manga(5L, "Attack on titan", 19.90));
		mangas.add(new Manga(7L, "Berserk", 9.36));
		mangas.add(new Manga(4L, "Hellsing Ultimate", 11.20));
		mangas.add(new Manga(2L, "Pokemon", 2.99));
		mangas.add(new Manga(3L, "Dragon ball Z", 3.59));

//		Collections.sort(mangas);
		mangas.sort(mangaByIdComparator);

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Manga mangaToSearch = new Manga(3L, "Dragon ball Z", 3.59);

		System.out.println("index: " + Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
	}

}
