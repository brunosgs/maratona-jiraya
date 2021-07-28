package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.dominio.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Jiraya");
		pessoa.setIdade(-1);

//		pessoa.imprime();

		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}

}
