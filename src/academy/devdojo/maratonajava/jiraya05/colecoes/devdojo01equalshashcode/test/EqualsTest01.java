package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo01equalshashcode.test;

import academy.devdojo.maratonajava.jiraya05.colecoes.devdojo01equalshashcode.dominio.Smartphone;

public class EqualsTest01 {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1ABC1", "iPhone");
		Smartphone s2 = new Smartphone("1ABC1", "iPhone");

		System.out.println(s1.equals(s2));
	}

}
