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
  [] = Range exemplo: [a-zA-C];
  ? = zero ou uma ocorrência;
  * = zero ou mais de uma ocorrência;
  + = uma ou mais ocorrências;
  {n, m} =  de n até m;
  () = agrupamento
  | = exemplo: o(v|c)o vai fazer um match nas ocorrências 'ovo' ou 'oco';
  $ = representa o fim da linha;
  . = caracter coringa, exemplo 1.3 ele localiza 123, 1@3, 133, 1A3
*/
public class PatternMatcherTest04 {

	public static void main(String[] args) {

		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("texto:  " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("regex: " + regex);
		System.out.println("Posições encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}

}
