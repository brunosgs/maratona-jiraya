package academy.devdojo.maratonajava.orientacaoobjetos.introducaometodos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.introducaometodos.dominio.Funcionario;

/*
  Crie uma classe Funcionario com os seguintes atributos:
  	- nome
  	- idade
  	- salario (tr�s sal�rios devem ser guardados)
  	
  Crie dois m�todos
    1. Para imprimir os dados
    2. Para tirar a m�dia dos sal�rios e imprimir o resultado.
*/
public class FuncionarioTest01 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Pedro";
		funcionario.idade = 25;
		funcionario.salarios = new double[] { 1200, 987.32, 2000 };

		funcionario.imprime();
	}

}
