package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);

		/**
		 * Regra BinarySearch: (-(ponto de inserção) - 1); É também preciso ordernar a
		 * lista para que o binary surta efeito.
		 */

		Collections.sort(numeros);
		System.out.println(numeros);
		System.out.println("index: " + Collections.binarySearch(numeros, 1));

	}

}
