package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime nowAfterToYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
		LocalTime timeNow = LocalTime.now();
		LocalTime timeMinus7Hours = LocalTime.now().plusHours(7);

		Duration d1 = Duration.between(now, nowAfterToYears);
		Duration d2 = Duration.between(timeNow, timeMinus7Hours);
		Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		Duration d4 = Duration.ofDays(20);
		Duration d5 = Duration.ofMinutes(3);
//		Duration d6 = Duration.of(3, ChronoUnit.HOURS);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
	}

}
