package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.dominio.Escola;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.dominio.Professor;

public class EscolaTest {

	public static void main(String[] args) {
		Professor professor01 = new Professor("Jiraya Sensei");
		Professor professor02 = new Professor("Kakashi Sensei");
		Professor[] professores = { professor01, professor02 };
		Escola escola = new Escola("Konoha", professores);

		escola.imprime();
	}

}
