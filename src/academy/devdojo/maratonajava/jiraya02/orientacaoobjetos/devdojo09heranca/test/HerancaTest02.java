package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo09heranca.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo09heranca.dominio.Funcionario;

/*
	0 - Bloco de inicializa��o est�tico da superclasse � executado quando a JVM carregar a superclasse;
	1 - Bloco de inicializa��o est�tico da subclasse � executado quando a JVM carregar a subclasse;
	2 - Alocado espa�o em mem�ria pro objeto da superclasse;
	3 - Cada atributo de superclasse � criado e inicializado com valores default ou o que for passado;
	4 - Bloco de inicializa��o da superclasse � executado na ordem em que aparece;
	5 - Construtor � executado da superclasse;
	6 - Alocado espa�o em mem�ria pro objeto da subclasse;
	7 - Cada atributo de subclasse � criado e inicializado com valores default ou o que for passado;
	8 - Bloco de inicializa��o da subclasse � executado na ordem em que aparece;
	9 - Construtor � executado da subclasse;
*/

public class HerancaTest02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Jiraya");
	}

}
