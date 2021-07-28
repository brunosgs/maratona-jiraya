package academy.devdojo.maratonajava.jiraya01.introducao;

/* Incialização desses tipos:
  - byte, short, int, long, float e double imprime 0
  - char '\u0000' imprime um espaço ' '
  - boolean = false
  - String imprime null
*/
public class Aula07Arrays {

	public static void main(String[] args) {
		int[] idades = new int[3]; // Um array é sempre um objeto
		idades[0] = 21;
		idades[1] = 15;
		idades[2] = (int) 11F;

		System.out.println(idades[1]);

		String[] nomes = new String[3];
		nomes[0] = "Goku";
		nomes[1] = "Kurosaki";
		nomes[2] = "Luffy";

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

		int[] numeros2 = { 1, 2, 3 };

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		for (int i : numeros2) {
			System.out.println(i);
		}
	}

}