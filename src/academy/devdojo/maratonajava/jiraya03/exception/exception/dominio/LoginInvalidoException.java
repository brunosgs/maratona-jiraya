package academy.devdojo.maratonajava.jiraya03.exception.exception.dominio;

public class LoginInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public LoginInvalidoException() {
		super("Login inv�lido");
	}

	public LoginInvalidoException(String msg) {
		super(msg);
	}

}
