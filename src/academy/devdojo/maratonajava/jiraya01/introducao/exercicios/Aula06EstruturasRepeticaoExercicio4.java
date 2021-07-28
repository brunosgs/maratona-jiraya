package academy.devdojo.maratonajava.jiraya01.introducao.exercicios;

// Dado o valor de um carro, descubra em quantas ele pode ser parcelado
// Condição valor da parcela >= 1000
public class Aula06EstruturasRepeticaoExercicio4 {

	public static void main(String[] args) {
		double valorCarro = 40369;

		System.out.println("Quantidade de parcelas:");

		for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
			double valorParcela = valorCarro / parcela;

			if (valorParcela < 1000) {
				continue;
			}

			System.out.println(parcela + "x de R$ " + valorParcela);
		}
	}

}
