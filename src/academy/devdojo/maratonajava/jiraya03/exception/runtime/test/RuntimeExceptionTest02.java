package academy.devdojo.maratonajava.jiraya03.exception.runtime.test;

public class RuntimeExceptionTest02 {
	public static void main(String[] args) {
		divisao(1, 0);

		System.out.println("Código finalizado!");
	}

	/**
	 * 
	 * @param a
	 * @param b não podes ser 0
	 * @return
	 * @throws IllegalArgumentException caso b seja 0
	 */
	private static int divisao(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
		}

		return a / b;
	}
}
