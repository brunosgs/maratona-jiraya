package academy.devdojo.maratonajava.introducao.exercicios;

public class Aula05EstruturasCondicionaisExercicio {

	public static void main(String[] args) {
		double salarioAnual = 45000;
		double primeiraFaixa = 9.70 / 100;
		double segundaFaixa = 37.35 / 100;
		double terceiraFaixa = 49.50 / 100;
		double valorDoImposto;

		if (salarioAnual <= 34712) {
			valorDoImposto = salarioAnual * primeiraFaixa;
		} else if (salarioAnual >= 37713 && salarioAnual <= 68507) {
			valorDoImposto = salarioAnual * segundaFaixa;
		} else {
			valorDoImposto = salarioAnual * terceiraFaixa;
		}

		System.out.println(valorDoImposto);
	}

}
