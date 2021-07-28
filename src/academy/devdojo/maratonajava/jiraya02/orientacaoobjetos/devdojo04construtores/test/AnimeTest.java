package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo04construtores.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo04construtores.dominio.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação", "Production IG");

		anime.imprime();
	}

}
