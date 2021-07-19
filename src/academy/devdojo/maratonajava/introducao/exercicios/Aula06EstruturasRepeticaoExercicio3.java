package academy.devdojo.maratonajava.introducao.exercicios;

// Dado o valor de um carro, descubra em quantas ele pode ser parcelado
// Condição valor da parcela >= 1000
public class Aula06EstruturasRepeticaoExercicio3 {

	public static void main(String[] args) {
		double valorCarro = 40369;

		System.out.println("Quantidade de parcelas:");

		for (int parcela = 1; parcela <= valorCarro; parcela++) {
			double valorParcela = valorCarro / parcela;

			if (valorParcela < 850) {
				break;
			}

			System.out.println(parcela + "x de R$ " + valorParcela);
		}
	}

}
