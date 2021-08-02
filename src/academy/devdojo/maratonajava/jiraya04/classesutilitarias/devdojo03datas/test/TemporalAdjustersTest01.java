package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now = now.withDayOfMonth(20); // Altera o dia da data
		System.out.println("Altera o dia: " + now);

		now = now.withMonth(5); // Altera o mês da data
		System.out.println("Altera o mês: " + now);

		now = now.with(ChronoField.DAY_OF_MONTH, 8);
		System.out.println("Altera o dia com ChronoField: " + now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
	}

}
