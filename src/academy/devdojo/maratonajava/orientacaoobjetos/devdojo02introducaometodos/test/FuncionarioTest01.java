package academy.devdojo.maratonajava.orientacaoobjetos.devdojo02introducaometodos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo02introducaometodos.dominio.Funcionario;

/*
  Crie uma classe Funcionario com os seguintes atributos:
  	- nome
  	- idade
  	- salario (três salários devem ser guardados)
  	
  Crie dois métodos
    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado.
*/
public class FuncionarioTest01 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Pedro");
		funcionario.setIdade(25);;
		funcionario.setSalarios(new double[] { 1200, 987.32, 2000 });

		funcionario.imprime();
	}

}
