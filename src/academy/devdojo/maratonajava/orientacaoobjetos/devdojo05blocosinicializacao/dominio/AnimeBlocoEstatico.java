package academy.devdojo.maratonajava.orientacaoobjetos.devdojo05blocosinicializacao.dominio;

/*
  0 - Bloco de inicialização static é executado quando a JVM carregar a classe.
  1 - Alocado espaço em memória pro objeto
  2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
  3 - Bloco de inicialização é executado
  4 - Construtor é executado
*/
public class AnimeBlocoEstatico {
	private String nome;
	private static int[] episodios;

	static {
		// A regra é que o bloco de inicialização sempre é executando antes do
		// construtor da classe

		System.out.println("Dentro do bloco de inicialização estático");
		AnimeBlocoEstatico.episodios = new int[100];

		for (int i = 0; i < AnimeBlocoEstatico.episodios.length; i++) {
			AnimeBlocoEstatico.episodios[i] = i + 1;
		}
	}

	static {
		System.out.println("Dentro do bloco de inicialização 2 estático");
	}

	static {
		System.out.println("Dentro do bloco de inicialização 3 estático");
	}

	{
		System.out.println("Dentro do bloco de inicialização 4");
	}

	public AnimeBlocoEstatico() {
		for (int episodio : AnimeBlocoEstatico.episodios) {
			System.out.print(episodio + " ");
		}

		System.out.println();
	}

	public AnimeBlocoEstatico(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
