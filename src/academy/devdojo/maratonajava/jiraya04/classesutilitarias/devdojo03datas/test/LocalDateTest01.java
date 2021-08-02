package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);

		System.out.println(date.getYear());
		System.out.println(date.getMonth() + " = " + date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear());
		System.out.println(date.get(ChronoField.DAY_OF_MONTH));
		System.out.println(date);

		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);
	}

}
