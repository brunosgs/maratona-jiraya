package academy.devdojo.maratonajava.orientacaoobjetos.devdojo01introducaoclasses.test;

import academy.devdojo.maratonajava.orientacaoobjetos.devdojo01introducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		Professor professor = new Professor();

		professor.nome = "Mestre Kami";
		professor.idade = 164;
		professor.sexo = 'M';

		System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
	}

}
