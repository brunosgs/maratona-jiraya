package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {

	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBancoDeDados();

		repositorio.salvar();
	}

}
