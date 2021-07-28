package academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.servico;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando no Banco de Dados...");
	}

}
