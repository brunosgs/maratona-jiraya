package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

	public static void main(String[] args) {
		LocalDateTime aniversario = LocalDateTime.of(1994, Month.JANUARY, 24, 6, 0, 0);
		LocalDateTime now = LocalDateTime.now();

		System.out.println(ChronoUnit.DAYS.between(aniversario, now));
	}

}
