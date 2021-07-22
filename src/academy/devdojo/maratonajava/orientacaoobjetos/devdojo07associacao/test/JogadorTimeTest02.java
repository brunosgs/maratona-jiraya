package academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.dominio.Jogador;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.dominio.Time;

public class JogadorTimeTest02 {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Cafu");
		Jogador jogador02 = new Jogador("Pelé");
		Jogador[] jogadores = { jogador, jogador02 };
		Time time = new Time("Brasil");

		jogador.setTime(time);
		jogador02.setTime(time);
		time.setJogadores(jogadores);

		System.out.println("--- Jogador ---");
		jogador.imprime();
		jogador02.imprime();

		System.out.println("--- Time ---");
		time.imprime();
	}

}
