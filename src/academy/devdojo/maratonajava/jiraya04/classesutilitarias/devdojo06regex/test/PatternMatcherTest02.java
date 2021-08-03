package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo06regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Alguns dos metacaracteres de express�es regulares:
  \d = Todos os d�gitos;
  \D = Tudo o que n�o for d�gitos;
  \s = Todos os espa�os em branco \t \n \f \r;
  \S = Todos os caracteres menos os espa�os em branco;
  \w = a-ZA-Z, d�gitos, _;
  \W = Tudo que n�o for incluso no \w;
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
		System.out.println("Posi��es encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}

}
