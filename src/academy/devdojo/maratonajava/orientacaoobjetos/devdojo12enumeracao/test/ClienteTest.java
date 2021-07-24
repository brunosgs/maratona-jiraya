package academy.devdojo.maratonajava.orientacaoobjetos.devdojo12enumeracao.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo12enumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo12enumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.orientacaoobjetos.devdojo12enumeracao.dominio.TipoPagamento;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente01 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente cliente02 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

		System.out.println(cliente01);
		System.out.println(cliente02);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

		TipoCliente tipoCliente01 = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente01.getNomeRelatorio());

		TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
		System.out.println(tipoCliente02);
	}

}
