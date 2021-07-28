package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo08leiturateclado.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();

		System.out.print("Digite a idade: ");
		int idade = scan.nextInt();

		System.out.print("Digite M ou F para o seu sexo: ");
		char sexo = scan.next().charAt(0);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);

		scan.close();
	}

}
