package academy.devdojo.maratonajava.orientacaoobjetos.introducaometodos.dominio;

public class Funcionario {
	public String nome;
	public int idade;
	public double[] salarios;

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);

		if (salarios == null) {
			return;
		}

		for (double salario : this.salarios) {
			System.out.println("Salário: " + salario);
		}

		imprimeMedia();
	}

	public void imprimeMedia() {
		if (salarios == null) {
			return;
		}

		double media = 0;

		for (double salario : salarios) {
			media += salario;
		}

		media /= salarios.length;

		System.out.println("Média dos salários: " + media);
	}

}
