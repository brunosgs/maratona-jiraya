package academy.devdojo.maratonajava.orientacaoobjetos.devdojo01introducaoclasses.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo01introducaoclasses.dominio.Carro;

/*
 	Exercicio:
 	- Crie um classe carro com os seguintes atributos (nome, modelo, ano) em seguida,
 	crie dois objetos distintos e imprima seus valores.
*/
public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Carro carro2 = new Carro();

		carro.nome = "Polo";
		carro.modelo = "VW";
		carro.ano = 2020;

		carro2.nome = "HB20";
		carro2.modelo = "Hyundai";
		carro2.ano = 2016;

		// Referenciado um objeto do mesmo tipo, nessa situação a referência foi perdida
		// do objeto carro2
		carro = carro2;

		System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano + "\n");
		System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
	}

}
