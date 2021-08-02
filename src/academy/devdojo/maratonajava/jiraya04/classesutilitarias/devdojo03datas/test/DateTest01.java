package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.util.Date;

// A classe Date foi depreciada
public class DateTest01 {

	public static void main(String[] args) {
		Date date = new Date(1627678384425L); // long 1000000

		date.setTime(date.getTime() + 3600000L);
		System.out.println(date);
	}

}
