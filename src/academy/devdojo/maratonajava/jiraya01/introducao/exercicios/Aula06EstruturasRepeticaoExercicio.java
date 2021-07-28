package academy.devdojo.maratonajava.jiraya01.introducao.exercicios;

// Imprima todos os números pares de 0 até 1000000
public class Aula06EstruturasRepeticaoExercicio {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000000; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
