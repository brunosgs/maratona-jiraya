package academy.devdojo.maratonajava.orientacaoobjetos.devdojo05blocosinicializacao.dominio;

/*
  0 - Bloco de inicializa��o static � executado quando a JVM carregar a classe.
  1 - Alocado espa�o em mem�ria pro objeto
  2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
  3 - Bloco de inicializa��o � executado
  4 - Construtor � executado
*/
public class AnimeBlocoEstatico {
	private String nome;
	private static int[] episodios;

	static {
		// A regra � que o bloco de inicializa��o sempre � executando antes do
		// construtor da classe

		System.out.println("Dentro do bloco de inicializa��o est�tico");
		AnimeBlocoEstatico.episodios = new int[100];

		for (int i = 0; i < AnimeBlocoEstatico.episodios.length; i++) {
			AnimeBlocoEstatico.episodios[i] = i + 1;
		}
	}

	static {
		System.out.println("Dentro do bloco de inicializa��o 2 est�tico");
	}

	static {
		System.out.println("Dentro do bloco de inicializa��o 3 est�tico");
	}

	{
		System.out.println("Dentro do bloco de inicializa��o 4");
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
