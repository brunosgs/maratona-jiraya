package academy.devdojo.maratonajava.orientacaoobjetos.devdojo03sobrecargametodos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo03sobrecargametodos.dominio.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		Anime anime = new Anime();

		anime.init("Akudama Drive", "TV", 12);
		anime.init("Akudama Drive", "TV", 12, "Ação");
		anime.setGenero("Ação");
		anime.imprime();
	}

}
