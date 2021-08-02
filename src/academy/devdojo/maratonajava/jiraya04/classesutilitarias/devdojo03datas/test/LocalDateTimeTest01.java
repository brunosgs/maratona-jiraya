package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.parse("2022-08-06");
		LocalTime time = LocalTime.parse("09:45:21");

		System.out.println(localDateTime);
		System.out.println(date);
		System.out.println(time);

		LocalDateTime localDateTimedate2 = date.atTime(time);
		System.out.println(localDateTimedate2);

		LocalDateTime localDateTimedate3 = time.atDate(date);
		System.out.println(localDateTimedate3);
	}

}
