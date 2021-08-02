package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo04formatacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTest01 {

	public static void main(String[] args) {
//		String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
		String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern2);

		System.out.println(sdf.format(new Date()));

		try {
			System.out.println(sdf.parse("Amsterdam 02 de Agosto de 2021"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
