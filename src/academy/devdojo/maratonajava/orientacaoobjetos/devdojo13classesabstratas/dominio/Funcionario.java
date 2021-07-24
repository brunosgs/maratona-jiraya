package academy.devdojo.maratonajava.orientacaoobjetos.devdojo13classesabstratas.dominio;

/* Em classes abstratas é possivel ter métodos concretos e abstratos,
   mas em uma classe concreta não é possível ter métodos abstratos, só métodos concretos.
*/
public abstract class Funcionario extends Pessoa {
	protected String nome;
	protected double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	public abstract void calculaBonus();

	@Override
	public void imprime() {
		System.out.println("Imprimindo...");
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
}
