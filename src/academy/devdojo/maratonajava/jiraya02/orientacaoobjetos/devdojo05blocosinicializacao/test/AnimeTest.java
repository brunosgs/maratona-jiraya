package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo05blocosinicializacao.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo05blocosinicializacao.dominio.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		Anime anime = new Anime();

		for (int episodio : anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
	}

}
