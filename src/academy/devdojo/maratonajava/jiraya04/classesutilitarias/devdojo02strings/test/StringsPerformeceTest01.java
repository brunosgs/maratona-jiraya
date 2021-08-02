package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo02strings.test;

public class StringsPerformeceTest01 {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(1);
		long fim = System.currentTimeMillis();

		System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

		long inicioBuilder = System.currentTimeMillis();
		concatStringBuilder(1000000);
		long fimBuilder = System.currentTimeMillis();

		System.out.println("Tempo gasto para String: " + (fimBuilder - inicioBuilder) + "ms");

		long inicioBuffer = System.currentTimeMillis();
		concatStringBuffer(1000000);
		long fimBuffer = System.currentTimeMillis();

		System.out.println("Tempo gasto para String: " + (fimBuffer - inicioBuffer) + "ms");
	}

	@SuppressWarnings("unused")
	private static void concatString(int tamanho) {
		String texto = "";

		for (int i = 0; i < tamanho; i++) {
			texto += i;
		}
	}

	private static void concatStringBuilder(int tamanho) {
		StringBuilder sb = new StringBuilder(tamanho);

		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}

	private static void concatStringBuffer(int tamanho) {
		StringBuffer sb = new StringBuffer(tamanho);

		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}

}
