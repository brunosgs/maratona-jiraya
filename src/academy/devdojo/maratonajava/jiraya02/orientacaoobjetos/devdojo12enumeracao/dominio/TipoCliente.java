package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo12enumeracao.dominio;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa F?sica"),
	PESSOA_JURIDICA(2, "Pessoa Jur?dica");

	private int valor;
	private String nomeRelatorio;

	TipoCliente(int valor, String nomeRelatorio) {
		this.valor = valor;
		this.nomeRelatorio = nomeRelatorio;
	}

	public int getValor() {
		return valor;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for (TipoCliente tipoCliente : values()) {
			if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}

		return null;
	}

}
