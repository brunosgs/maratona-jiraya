package academy.devdojo.maratonajava.introducao;

/*
 - Operadores do tipo aritiméticos = + - * / % 
 - O operador '+' também é usado para concatenação.
 - Operadores relacionais <>, <=, >= 
 - Operadores de igualdade ==, !=
 - Operadores lógicos && (AND), || (OR) e ! (NOT)
 - Operadores de atribuição = += -= /= %=
*/
public class Aula04Operadores {

	public static void main(String[] args) {
		// Aritiméticos
		int numero1 = 10;
		int numero2 = 20;
		double resultado = numero1 + numero2;

		System.out.println(resultado);

		int resto = 21 % 7;
		System.out.println(resto);

		// Relacionais e igualdade
		int b = 10;
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezIgualDez = 10 == b;
		boolean isDezDiferenteDez = 10 != b;

		System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
		System.out.println("isDezIgualVinte: " + isDezIgualVinte);
		System.out.println("isDezIgualDez: " + isDezIgualDez);
		System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

		// Lógicos
		int idade = 35;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

		System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

		/*----------------------*/
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
				|| valorTotalContaPoupanca > valorPlaystation;

		System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);
		
		// Atribuição
		double bonus = 1800;
		bonus += 1000;
		bonus -= 1000;
		bonus *= 2;
		bonus /= 2;
		bonus %= 2;
		System.out.println(bonus);
		
		// Unarios
		int contador = 0;
		contador++;
		System.out.println(contador);
		contador--;
		System.out.println(contador);
	}

}
