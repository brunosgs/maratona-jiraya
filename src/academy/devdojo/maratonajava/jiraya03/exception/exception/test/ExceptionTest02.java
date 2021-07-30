package academy.devdojo.maratonajava.jiraya03.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

	public static void main(String[] args) throws IOException {
		criarNovoArquivo();
	}

	// Dar prefer�ncia de n�o lan�ar para frente o erro e tratar ele dentro do
	// m�todo quando o mesmo for private
	public static void criarNovoArquivo() throws IOException {
		File file = new File("arquivo\\test.txt");

		try {
			boolean isCriado = file.createNewFile();

			System.out.println("Arquivo criado: " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
