package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.servico;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Tomate;

// Caso n�o esteja acessando nenhuma atributo de classe, ideal seria tranformar os m�todos em est�ticos
public class CalculadoraImposto {
	public static void calcularImposto(Produto produto) {
		System.out.println("Relat�rio de imposto");

		double imposto = produto.calcularImposto();

		System.out.println("Produto: " + produto.getNome());
		System.out.println("Pre�o: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);

		if (produto instanceof Tomate) {
			System.out.println("Data validade: " + ((Tomate) produto).getDataValidade());
		}

	}
}
