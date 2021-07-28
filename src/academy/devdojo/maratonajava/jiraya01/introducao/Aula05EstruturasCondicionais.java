package academy.devdojo.maratonajava.jiraya01.introducao;

public class Aula05EstruturasCondicionais {

	public static void main(String[] args) {
		int idade = 15;
		boolean isAutorizadoComprasBebida = idade >= 18;

		if (isAutorizadoComprasBebida) {
			System.out.println("Autorizado a comprar bebida alcólica");
		}

		// !
		if (!isAutorizadoComprasBebida) {
			System.out.println("Não autorizado a compras bebida alcólica");
		}

		System.out.println("Fora do if");

		// IF-ELSE
		if (isAutorizadoComprasBebida) {
			System.out.println("Autorizado a comprar bebida alcólica");
		} else {
			System.out.println("Não autorizado a compras bebida alcólica");
		}

		// Imprime na tela a categoria se idade < 15 = infantil, se idade >= 15 && idade
		// < 18 = juvenil e se a idade >= 18 = adulto

		idade = 20;
		String categoria;

		// IF-ELSE-IF
		if (idade < 15) {
			categoria = "Categoria infantil";
		} else if (idade >= 15 && idade < 18) {
			categoria = "Categoria juvenil";
		} else {
			categoria = "Categoria adulto";
		}

		System.out.println(categoria);

		// Operador ternário
		double salario = 5000;
		String result = salario > 5000 ? "Eu vou fazer doação para DevDojo" : "Ainda não consigo doar para o DevDojo";

		System.out.println(result);

		// Evitar de fazer dessa forma, pois não é a mas correta de fazer. Se existir
		// mais de um ternário a leitura pode ficar complexa
		categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria adulto";

		// SWITCH
		// Imprima o dia da semana, considerando 1 como domingo

		byte dia = 5;

		// char, int, byte, short, enum, String
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabádo");
			break;
		default:
			break;
		}
	}

}
