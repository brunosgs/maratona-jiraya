package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo04formatacoes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		String localDateFormatado01 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		String localDateFormatado02 = localDate.format(DateTimeFormatter.ISO_DATE);
		String localDateFormatado03 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		String localDateTimeFormatado01 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);

		System.out.println(localDateFormatado01);
		System.out.println(localDateFormatado02);
		System.out.println(localDateFormatado03);
		System.out.println(localDateTimeFormatado01);

		LocalDate parse01 = LocalDate.parse("20210802", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse02 = LocalDate.parse("2021-08-02", DateTimeFormatter.ISO_DATE);
		LocalDate parse03 = LocalDate.parse("2021-08-02", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDateTime parseTime01 = LocalDateTime.parse("2021-08-02T17:42:02.664");

		System.out.println(parse01);
		System.out.println(parse02);
		System.out.println(parse03);
		System.out.println(parseTime01);

		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatBR = LocalDate.now().format(formatterBR);
		System.out.println(formatBR);
		LocalDate parseBR = LocalDate.parse("02/08/2021", formatterBR);
		System.out.println(parseBR);

		DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		String formatGR = LocalDate.now().format(formatterGR);
		System.out.println(formatGR);
		LocalDate parseGR = LocalDate.parse("02.August.2021", formatterGR);
		System.out.println(parseGR);
	}

}
