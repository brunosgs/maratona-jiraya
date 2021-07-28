package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.servico;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em Memoria...");
	}

}