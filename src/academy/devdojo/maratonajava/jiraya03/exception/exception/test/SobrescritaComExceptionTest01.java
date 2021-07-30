package academy.devdojo.maratonajava.jiraya03.exception.exception.test;

import academy.devdojo.maratonajava.jiraya03.exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.jiraya03.exception.exception.dominio.LoginInvalidoException;

public class SobrescritaComExceptionTest01 {

	public static void main(String[] args) {
//		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();

		try {
			funcionario.salvar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

}
