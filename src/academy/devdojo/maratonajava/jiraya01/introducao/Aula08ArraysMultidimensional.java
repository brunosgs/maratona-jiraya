package academy.devdojo.maratonajava.jiraya01.introducao;

public class Aula08ArraysMultidimensional {

	public static void main(String[] args) {
		int[][] dias = new int[3][3];
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 31;

		System.out.println(dias[0][0]);

		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}

		System.out.println("\n/********************************************/\n");

		// Foreach para array multidimensional
		for (int[] arr : dias) {
			for (int num : arr) {
				System.out.println(num);
			}
		}

		System.out.println("\n/********************************************/\n");

		// Inicializando arrays multidimensional
		int[][] arrayInt = new int[3][];
		int[] array = { 1, 2 };

		arrayInt[0] = array;
		arrayInt[1] = new int[] { 1, 2, 3 };
		arrayInt[2] = new int[] { 1, 2, 3, 4, 5, 6 };

		int[][] arrayInt2 = { { 0, 1 }, { 0, 1, 2 }, { 0, 1, 2, 3, 4, 5 } };

		for (int[] arrayBase : arrayInt2) {
			System.out.println("\n---");

			for (int itemArrayBase : arrayBase) {
				System.out.print(itemArrayBase + " ");
			}
		}
	}

}
