package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int[] numeros = { 1, 2, 3, 4, 5 };

		calculadora.somaArray(numeros);

		// Adicionar o varArgs sempre como o último dos atributos na chamada do método.
		calculadora.somaVarArgs(1, 3, 5, 9);
	}

}
