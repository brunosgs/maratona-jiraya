package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo05blocosinicializacao.dominio;

/*
  1 - Alocado espa�o em mem�ria pro objeto
  2 - Cada atributo de classe � criado e inicializado com valores default ou o que for passado
  3 - Bloco de inicializa��o � executado
  4 - Construtor � executado
*/
public class Anime {
	private String nome;
	private int[] episodios;

	{
		// A regra � que o bloco de inicializa��o sempre � executando antes do
		// construtor da classe

		episodios = new int[100];

		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}

	public Anime() {
		for (int episodio : episodios) {
			System.out.print(episodio + " ");
		}

		System.out.println();
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}

}
