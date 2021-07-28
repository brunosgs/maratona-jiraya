package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo15polimorfismo.dominio.Tomate;

public class ProdutoTest02 {

	public static void main(String[] args) {
		Produto produto01 = new Computador("Ryzen 9", 3000);
		Produto produto02 = new Tomate("Americano", 20);

		System.out.println(produto01.getNome());
		System.out.println(produto01.getValor());
		System.out.println(produto01.calcularImposto());
		System.out.println("\n-----------------------------\n");

		System.out.println(produto02.getNome());
		System.out.println(produto02.getValor());
		System.out.println(produto02.calcularImposto());
	}

}
