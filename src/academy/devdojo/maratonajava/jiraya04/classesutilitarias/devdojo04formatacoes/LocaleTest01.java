package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo04formatacoes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

// Locale serve para internacionaliza��o
public class LocaleTest01 {

	public static void main(String[] args) {
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSuica = new Locale("it", "CH");
		Locale localeIndia = new Locale("hi", "IN");
		Locale localeJapao = new Locale("ja", "JP");
		Locale localeHolanda = new Locale("nl", "NL");

		Calendar calendar = Calendar.getInstance();

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

		System.out.println("It�lia: " + df1.format(calendar.getTime()));
		System.out.println("Su��a: " + df2.format(calendar.getTime()));
		System.out.println("�ndia: " + df3.format(calendar.getTime()));
		System.out.println("Jap�o: " + df4.format(calendar.getTime()));
		System.out.println("Holanda: " + df5.format(calendar.getTime()));

		System.out.println(localeItaly.getDisplayCountry(localeHolanda));
		System.out.println(localeSuica.getDisplayCountry(localeItaly));

		System.out.println(localeItaly.getDisplayLanguage(localeIndia));
	}

}
