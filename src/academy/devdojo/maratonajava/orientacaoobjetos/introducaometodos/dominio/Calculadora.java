package academy.devdojo.maratonajava.orientacaoobjetos.introducaometodos.dominio;

public class Calculadora {
	public void somaDoisNumeros() {
		System.out.println(10 + 10);
	}

	public void subtraiDoisNumeros() {
		System.out.println(21 - 2);
	}

	public void multiplicaDoisNumeros(int num1, float num2) {
		System.out.println(num1 * num2);
	}

	public double divideDoisNumeros(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}

		return num1 / num2;
	}

	// Esse m�todo obt�m o mesmo resultado, n�o signicia que esta errado, mas n�o
	// seria ideal fazer dessa forma, j� que o m�todo divideDoisNumeros faz de uma
	// forma mais clara.
	public double divideDoisNumeros02(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}

	public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("N�o existe divis�o por 0");

			return;
		}

		System.out.println(num1 / num2);
	}

	public void alteraDoisNumeros(int numero1, int numero2) {
		numero1 = 99;
		numero2 = 33;

		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("Num1: " + numero1);
		System.out.println("Num1: " + numero2);
	}

	public void somaArray(int[] numeros) {
		int soma = 0;

		for (int num : numeros) {
			soma += num;
		}

		System.out.println(soma);
	}

	public void somaVarArgs(int... numeros) {
		int soma = 0;

		for (int num : numeros) {
			soma += num;
		}

		System.out.println(soma);
	}
}
