package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo09serializacao.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo09serializacao.dominio.Aluno;
import academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo09serializacao.dominio.Turma;

public class SerializacaoTest01 {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(1L, "Bruno Gomes", "123456789");
		Turma turma = new Turma("Turma Maratona Java Virado no Jiraya");

		aluno.setTurma(turma);

		serializar(aluno);
		deserializar();
	}

	private static void serializar(Aluno aluno) {
		Path path = Paths.get("pasta/aluno.ser");

		try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
			oos.writeObject(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void deserializar() {
		Path path = Paths.get("pasta/aluno.ser");

		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
			Aluno aluno = (Aluno) ois.readObject();

			System.out.println(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
