package academy.devdojo.maratonajava.orientacaoobjetos.devdojo02introducaometodos.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

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

		for (double salario : salarios) {
			media += salario;
		}

		media /= salarios.length;

		System.out.println("Média dos salários: " + media);
	}

}
