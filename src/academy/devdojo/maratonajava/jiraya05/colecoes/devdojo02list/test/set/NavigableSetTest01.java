package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo01equalshashcode.dominio.Smartphone;
import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio.Manga;

public class NavigableSetTest01 {

	public static void main(String[] args) {
		/**
		 * Deve se utilizar o TreeSet quando a classe que estou criando implementa
		 * comparable ou comparator.
		 */
		NavigableSet<Smartphone> setSmartphones = new TreeSet<>(new SmartphoneMarcaComparator());
		Smartphone smartphone = new Smartphone("132", "Nokia");

		setSmartphones.add(smartphone);

		NavigableSet<Manga> setMangas = new TreeSet<>(new MangaPrecoComparator());

		setMangas.add(new Manga(5L, "Attack on titan", 19.90, 0));
		setMangas.add(new Manga(7L, "Berserk", 9.36, 4));
		setMangas.add(new Manga(4L, "Hellsing Ultimate", 11.20, 0));
		setMangas.add(new Manga(2L, "Pokemon", 2.99, 2));
		setMangas.add(new Manga(3L, "Dragon ball Z", 3.59, 0));
		setMangas.add(new Manga(10L, "Aaragon", 2.39, 0));

		for (Manga manga : setMangas) {
			System.out.println(manga);
		}

		System.out.println("-------------------------------------------");

		Manga yuyu = new Manga(17L, "Yuyu Hakusho", 8, 6);
		System.out.println(setMangas.lower(yuyu));
		System.out.println(setMangas.floor(yuyu));
		System.out.println(setMangas.higher(yuyu));
		System.out.println(setMangas.ceiling(yuyu));
		System.out.println(setMangas.size());
		System.out.println(setMangas.pollLast());
		System.out.println(setMangas.size());

		// lower <
		// floor <=
		// higher >
		// ceiling >=
	}

}

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

	@Override
	public int compare(Smartphone s1, Smartphone s2) {
		return s1.getMarca().compareTo(s2.getMarca());
	}

}

class MangaPrecoComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga m1, Manga m2) {
		return Double.compare(m1.getPreco(), m2.getPreco());
	}

}
