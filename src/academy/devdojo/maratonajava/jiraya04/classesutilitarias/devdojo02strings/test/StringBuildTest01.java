package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo02strings.test;

public class StringBuildTest01 {

	public static void main(String[] args) {
		String nome = "Bruno Gomes";

		nome.concat(" DevDojo");
		System.out.println(nome);

		StringBuilder sb = new StringBuilder("Bruno Gomes");

		sb.append(" DevDojo").append(" Academy");
		sb.reverse();
		System.out.println("Inverte a String: " + sb);
		sb.reverse();
		sb.delete(0, 3);
		System.out.println("Deleta parte da String: " + sb);
	}

}
