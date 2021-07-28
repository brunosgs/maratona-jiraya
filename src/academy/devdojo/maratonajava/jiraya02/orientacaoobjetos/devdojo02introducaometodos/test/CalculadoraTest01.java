package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int num1 = 1;
		int num2 = 2;

		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(20, 40.5F);

		double result = calculadora.divideDoisNumeros(20, 0);

		System.out.println(result);

		calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

		// Quando esta passando uma variável do tipo primitivo, é sempre enviado uma
		// cópia dessa variável não a referência.
		calculadora.alteraDoisNumeros(num1, num2);

		System.out.println("\nDentro do CalculadoraTest");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num1);
		System.out.println("\n\nFinalizando CalculadoraTest!");
	}

}
