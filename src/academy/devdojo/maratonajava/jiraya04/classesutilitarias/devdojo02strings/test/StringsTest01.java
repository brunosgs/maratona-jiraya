package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo02strings.test;

// Verificar conceitos de String interning
public class StringsTest01 {

	public static void main(String[] args) {
		String nome = "Bruno"; // String constant pool
		String nome2 = "Bruno";

		nome.concat(" Gomes");

		/*
		 * Quando verificado a String nome, a mesma não concatenou porque existe a
		 * imutabilidade das Strings, se não for feita uma nova associação a mesma não é
		 * alterada, ela continua dentro do pool.
		 */
		System.out.println(nome);
		System.out.println(nome == nome2);

		String nome3 = new String("Bruno");

		System.out.println(nome2 == nome3);
		System.out.println(nome2 == nome3.intern());
	}

}
