package academy.devdojo.maratonajava.jiraya03.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// Exceções mais genéricas sempre tem que ir no final quando lançado múltiplos catch's.
public class RuntimeExceptionTest04 {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("Dentro do ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}

		// Quando for na mesma linha de herança e optar por utilizar mult catch's na
		// mesma linha, é idenficiado o mais generico e utilizado, no caro o
		// IOException.
		try {
			talvezLanceException();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

	private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

	}
}
