package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<>();

		nomes.add("William");
		nomes.add("DevDojo Academy");

		nomes2.add("Gomes");
		nomes2.add("Academy");

		nomes.addAll(nomes2);

//		nomes.remove("DevDojo Academy");

		for (String nome : nomes) {
			System.out.println(nome);
		}

		nomes.add("Souza");
		System.out.println("----------------------");

		int size = nomes.size(); // Teste de tamanho da lista.

		for (int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));
			nomes.add("Gomes" + i);
		}

		System.out.println(nomes);
		System.out.println("----------------------");

		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);

	}

}
