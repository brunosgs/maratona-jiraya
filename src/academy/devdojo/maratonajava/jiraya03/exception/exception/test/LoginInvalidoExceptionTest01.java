package academy.devdojo.maratonajava.jiraya03.exception.exception.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.jiraya03.exception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void logar() throws LoginInvalidoException {
		Scanner scan = new Scanner(System.in);

		String usernameDB = "Goku";
		String senhaDB = "ssj";

		System.out.print("Usu�rio: ");
		String usernameInput = scan.nextLine();

		System.out.print("Senha: ");
		String senhaInput = scan.nextLine();

		scan.close();

		if (!usernameDB.equals(usernameInput) || !senhaDB.equals(senhaInput)) {
			throw new LoginInvalidoException("Usu�rio ou senha inv�lidos!");
		}

		System.out.println("Usu�rio logado com sucesso");
	}
}
