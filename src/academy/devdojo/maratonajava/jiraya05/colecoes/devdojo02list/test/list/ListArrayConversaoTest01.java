package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.test.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		Integer[] listToArray = numeros.toArray(new Integer[0]);

		System.out.println(Arrays.toString(listToArray));
		System.out.println("\n----------------------------------------\n");

		Integer[] numerosArray = new Integer[3];
		numerosArray[0] = 1;
		numerosArray[1] = 2;
		numerosArray[2] = 3;
		List<Integer> arrayToList = Arrays.asList(numerosArray); // Cuidado a usar o asList, ele cria um link com o Array.

		arrayToList.set(0, 12);
		System.out.println(Arrays.toString(numerosArray));
		System.out.println(arrayToList);
		System.out.println("\n----------------------------------------\n");

		List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

		numerosList.add(99);
		System.out.println(numerosList);

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		System.out.println(asList);
	}

}
