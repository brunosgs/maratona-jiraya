package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao {

	public static void main(String[] args) {
		// Estruturas existentes while, do while, for

		int count = 0;

		while (count < 10) {
			System.out.println("While: " + count);
			count++;
		}

		do {
			System.out.println("Dentro do do-while");
		} while (count < 10);

		for (int i = 0; i < 10; i++) {
			System.out.println("For: " + i);
		}
	}

}
