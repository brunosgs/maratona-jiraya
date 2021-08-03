package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo06regex.test;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		String texto = "Levi,Eren,Mikasa,true,123";
		Scanner scan = new Scanner(texto);

		scan.useDelimiter(",");

		while (scan.hasNext()) {
			System.out.println(scan.next());

			if (scan.hasNextInt()) {
				int i = scan.nextInt();

				System.out.println("Int: " + i);
			} else if (scan.hasNextBoolean()) {
				boolean b = scan.nextBoolean();

				System.out.println("Boolean: " + b);
			}
		}

		scan.close();
	}

}
