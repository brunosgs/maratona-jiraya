package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo02introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();

		estudante01.nome = "Mudoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';

		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';

		System.out.println(estudante01.nome);
		System.out.println(estudante01.idade);
		System.out.println(estudante01.sexo);

		System.out.println("---------------------------");

		System.out.println(estudante02.nome);
		System.out.println(estudante02.idade);
		System.out.println(estudante02.sexo);

		// É passado uma variável para o método, que por sua vez recebe a cópia da
		// referencia para uma variável local.
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);

		System.out.println("##############################");
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
	}

}
