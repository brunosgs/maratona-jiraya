package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

	public static void main(String[] args) {
		Produto produto01 = new Computador("Ryzen 9", 3000);
		Tomate produto02 = new Tomate("Americano", 20);

		produto02.setDataValidade("11/12/2021");

		CalculadoraImposto.calcularImposto(produto01);

		System.out.println("\n-----------------------------\n");

		CalculadoraImposto.calcularImposto(produto02);
	}

}
