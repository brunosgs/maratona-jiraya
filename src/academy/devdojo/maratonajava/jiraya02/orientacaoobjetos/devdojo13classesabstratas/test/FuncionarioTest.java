package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo13classesabstratas.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo13classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo13classesabstratas.dominio.Gerente;

public class FuncionarioTest {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Nami", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

		System.out.println(gerente);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}

}
