package academy.devdojo.maratonajava.orientacaoobjetos.devdojo06modificadoresacesso.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo06modificadoresacesso.dominio.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro("BMW", 280);
		Carro carro2 = new Carro("Mercedes", 275);
		Carro carro3 = new Carro("Audi", 290);

		Carro.velocidadeLimite = 180;

		carro.imprime();
		carro2.imprime();
		carro3.imprime();
	}

}
