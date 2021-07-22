package academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.dominio.Jogador;

public class JogadorTest {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Jogador jogador2 = new Jogador("Romário");
		Jogador jogador3 = new Jogador("Cafu");
		Jogador[] jogadores = { jogador1, jogador2, jogador3 };

		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}

}
