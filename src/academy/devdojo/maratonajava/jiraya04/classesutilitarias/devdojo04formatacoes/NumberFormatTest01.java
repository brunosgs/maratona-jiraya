package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo04formatacoes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

	public static void main(String[] args) {
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		Locale localeFR = Locale.FRANCE;
		NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localeJP);
		nfa[2] = NumberFormat.getInstance(localeIT);
		nfa[3] = NumberFormat.getInstance(localeFR);

		double valor = 1036000.2120;

		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			numberFormat.setMaximumFractionDigits(2); // Adiciona números a fração
			System.out.println(numberFormat.format(valor));
		}

		String valorString = "1001.2130";

		try {
			System.out.println(nfa[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
