package academy.devdojo.maratonajava.introducao.exercicios;

// Imprima todos os n�meros pares de 0 at� 1000000
public class Aula06EstruturasRepeticaoExercicio {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000000; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
