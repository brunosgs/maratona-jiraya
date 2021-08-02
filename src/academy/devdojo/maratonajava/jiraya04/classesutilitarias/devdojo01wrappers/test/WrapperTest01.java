package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo01wrappers.test;

// As classes Wrapper são os tipos primitivos encapsulados.
public class WrapperTest01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Autoboxing
		Byte byteW = 127;
		Short shortW = 1;
		Integer intW = 1;
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character characterW = 'W';
		Boolean booleanW = false;

		// Unboxing
		int i = intW;
		Integer intW2 = Integer.parseInt("2");
		boolean verdadeiro = Boolean.parseBoolean("TruE"); // Parse de Boolean é case insensitive
		System.out.println("Parse Boolean: " + verdadeiro);

		System.out.println("Verifica se é digíto: " + Character.isDigit('A'));
		System.out.println("Verifica se é digíto: " + Character.isDigit('9'));
		System.out.println("Verifica se é digíto ou caracter: " + Character.isLetterOrDigit('!'));
		System.out.println("Verifica se é minúsculas: " + Character.isLowerCase('!'));
		System.out.println("Verifica se é maiúscula: " + Character.isUpperCase('!'));
		System.out.println("Converte para minúsculas: A para -> " + Character.toLowerCase('A'));
		System.out.println("Converte para maiúscula: a para -> " + Character.toUpperCase('a'));

	}

}
