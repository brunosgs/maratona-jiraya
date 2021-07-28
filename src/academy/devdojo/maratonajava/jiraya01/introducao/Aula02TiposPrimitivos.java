package academy.devdojo.maratonajava.jiraya01.introducao;

/*
  - Tipos primitivos são: int, double, float, char, byte, short, long, boolean.
  - Todos os tipos são númericos com exceção do boolean, cada item tem sua limitação de bytes.
*/
public class Aula02TiposPrimitivos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int idade = 27;
		int idadeCasting = (int) 10000000000L;
		long numeroLong = 100000L;
		long numeroLongCasting = (long) 155.23;

		double salarioDouble = 2000.0;
		float salarioFloat = 2500.0F;

		byte idadeByte = 27;
		short idadeShort = 27;

		boolean verdadeiro = true;
		boolean falso = false;

		char caractereASCII = 87;
		char caractereUnicode = '\u0041';

		System.out.println("A idade é: " + idade);
		System.out.println("A idade casting é: " + idadeCasting);

		System.out.println(numeroLongCasting);

		System.out.println(caractereASCII);
		System.out.println(caractereUnicode);
	}
}
