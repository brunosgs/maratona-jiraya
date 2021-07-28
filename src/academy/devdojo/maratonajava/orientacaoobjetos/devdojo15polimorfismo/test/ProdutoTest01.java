package academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo15polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {
		Computador computador = new Computador("NUC10i7", 11000);
		Tomate tomate = new Tomate("Tomate siciliano", 10);
		Televisao televisao = new Televisao("Samsung 50\"", 5000);

		CalculadoraImposto.calcularImposto(computador);
		System.out.println("\n-------------------------------------------\n");
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("\n-------------------------------------------\n");
		CalculadoraImposto.calcularImposto(televisao);
	}

}
