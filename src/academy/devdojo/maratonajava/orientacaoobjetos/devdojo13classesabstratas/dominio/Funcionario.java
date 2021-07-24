package academy.devdojo.maratonajava.orientacaoobjetos.devdojo13classesabstratas.dominio;

/* Em classes abstratas � possivel ter m�todos concretos e abstratos,
   mas em uma classe concreta n�o � poss�vel ter m�todos abstratos, s� m�todos concretos.
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
