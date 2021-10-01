package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo09serializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// N�o existe a chamada para objetos que s�o Serializable
public class Aluno implements Serializable {
	private static final long serialVersionUID = -3038869728890695362L;
	private Long id;
	private String nome;
	// Quando � informado o transient, significa que o atributo n�o deve ser
	// Serializado.
	private transient String password;
	// Atributos static n�o s�o serializados, eles pertencem ao objeto.
	private static final String NOME_ESCOLA = "DevDojo virad�o no Jiraya";
	private transient Turma turma;

	public Aluno(Long id, String nome, String password) {
		System.out.println("Construtor aluno");
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String nomeTurma = ois.readUTF();
			turma = new Turma(nomeTurma);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + ", NOME_ESCOLA=" + NOME_ESCOLA + ", turma=" + turma + "]";
	}

}
