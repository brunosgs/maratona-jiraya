package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class InteratorTest01 {

	public static void main(String[] args) {
		List<Manga> mangas = new LinkedList<>();

		mangas.add(new Manga(5L, "Attack on titan", 19.90, 0));
		mangas.add(new Manga(7L, "Berserk", 9.36, 4));
		mangas.add(new Manga(4L, "Hellsing Ultimate", 11.20, 0));
		mangas.add(new Manga(2L, "Pokemon", 2.99, 2));
		mangas.add(new Manga(3L, "Dragon ball Z", 3.59, 0));

//		Iterator<Manga> mangasIterator = mangas.iterator();
//
//		while (mangasIterator.hasNext()) {
//			if (mangasIterator.next().getQuantidade() == 0) {
//				mangasIterator.remove();
//			}
//		}

		mangas.removeIf(manga -> manga.getQuantidade() == 0);
		System.out.println(mangas);
	}

}
