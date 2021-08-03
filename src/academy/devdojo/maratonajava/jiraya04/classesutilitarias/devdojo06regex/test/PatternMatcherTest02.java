package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo06regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Alguns dos metacaracteres de expressões regulares:
  \d = Todos os dígitos;
  \D = Tudo o que não for dígitos;
  \s = Todos os espaços em branco \t \n \f \r;
  \S = Todos os caracteres menos os espaços em branco;
  \w = a-ZA-Z, dígitos, _;
  \W = Tudo que não for incluso no \w;
*/
public class PatternMatcherTest02 {

	public static void main(String[] args) {

		String regex = "\\W";
//		String texto = "abaaba";
		String texto2 = "g1 d__@$ s61 gt4s  ";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto2);

		System.out.println("texto:  " + texto2);
		System.out.println("indice: 0123456789");
		System.out.println("regex: " + regex);
		System.out.println("Posições encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}

}
