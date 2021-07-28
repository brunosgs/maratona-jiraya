package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.servico;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Tomate;

// Caso não esteja acessando nenhuma atributo de classe, ideal seria tranformar os métodos em estáticos
public class CalculadoraImposto {
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatório de imposto");

		double imposto = produto.calcularImposto();

		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);

		if (produto instanceof Tomate) {
			System.out.println("Data validade: " + ((Tomate) produto).getDataValidade());
		}

	}
}
