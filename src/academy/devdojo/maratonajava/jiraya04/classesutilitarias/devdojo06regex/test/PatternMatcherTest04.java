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
  [] = Range exemplo: [a-zA-C];
  ? = zero ou uma ocorr�ncia;
  * = zero ou mais de uma ocorr�ncia;
  + = uma ou mais ocorr�ncias;
  {n, m} =  de n at� m;
  () = agrupamento
  | = exemplo: o(v|c)o vai fazer um match nas ocorr�ncias 'ovo' ou 'oco';
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
		System.out.println("Posi��es encontradas");

		while (matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}

}
