package academy.devdojo.maratonajava.introducao.exercicios;

// Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50.
public class Aula06EstruturasRepeticaoExercicio2 {

	public static void main(String[] args) {
		int count = 50;

		for (int i = 0; i < count; i++) {
			if (i > 25) {
				break;
			}

			System.out.println(i);
		}
	}

}
