package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo03datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Doming�o � o primeiro dia da semana");
		}

		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		calendar.add(Calendar.DAY_OF_MONTH, 2); // Adiciona dias ao mes
//		calendar.add(Calendar.HOUR, 12); // Adiciona horas
		calendar.roll(Calendar.HOUR, 1);

		Date date = calendar.getTime();
		System.out.println(date);
	}

}
