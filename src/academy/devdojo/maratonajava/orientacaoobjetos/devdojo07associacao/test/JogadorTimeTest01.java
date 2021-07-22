package academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.dominio.Jogador;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.dominio.Time;

public class JogadorTimeTest01 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Time time = new Time("Seleção Brasileira");

		jogador1.setTime(time);
		jogador1.imprime();
	}

}
