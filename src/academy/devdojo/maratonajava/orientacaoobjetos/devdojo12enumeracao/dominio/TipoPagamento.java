package academy.devdojo.maratonajava.orientacaoobjetos.devdojo12enumeracao.dominio;

public enum TipoPagamento {
	DEBITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.1;
		}
	},
	CREDITO {
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.05;
		}
	};

	public double calcularDesconto(double valor) {

		return 0;
	}
}