package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		System.out.println(Instant.ofEpochSecond(3, -1000000000));

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}

}
