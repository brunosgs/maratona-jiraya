package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo06modificadoresacesso.dominio;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;

	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	// Um método estático não acessa atributos da classe, só é possível acessar
	// quando os mesmo é static
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

	public void imprime() {
		System.out.println("---------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade limite: " + Carro.getVelocidadeLimite());
	}
}
