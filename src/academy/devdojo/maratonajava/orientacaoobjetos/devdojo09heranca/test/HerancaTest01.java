package academy.devdojo.maratonajava.orientacaoobjetos.devdojo09heranca.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo09heranca.dominio.Endereco;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo09heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo09heranca.dominio.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Pessoa pessoa = new Pessoa("Toyohusa Shimazu");
		Funcionario funcionario = new Funcionario("Oda Nobunaga");

		endereco.setRua("Rua Francisco Pedro");
		endereco.setCep("88996-147");
		pessoa.setCpf("369.211.357-15");
		pessoa.setEndereco(endereco);
		pessoa.imprime();

		System.out.println("\n********************\n");
		funcionario.setCpf("159.357.789-78");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(2000);

		funcionario.imprime();
	}

}
