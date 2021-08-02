package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo01wrappers.test;

// As classes Wrapper s�o os tipos primitivos encapsulados.
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
		boolean verdadeiro = Boolean.parseBoolean("TruE"); // Parse de Boolean � case insensitive
		System.out.println("Parse Boolean: " + verdadeiro);

		System.out.println("Verifica se � dig�to: " + Character.isDigit('A'));
		System.out.println("Verifica se � dig�to: " + Character.isDigit('9'));
		System.out.println("Verifica se � dig�to ou caracter: " + Character.isLetterOrDigit('!'));
		System.out.println("Verifica se � min�sculas: " + Character.isLowerCase('!'));
		System.out.println("Verifica se � mai�scula: " + Character.isUpperCase('!'));
		System.out.println("Converte para min�sculas: A para -> " + Character.toLowerCase('A'));
		System.out.println("Converte para mai�scula: a para -> " + Character.toUpperCase('a'));

	}

}
