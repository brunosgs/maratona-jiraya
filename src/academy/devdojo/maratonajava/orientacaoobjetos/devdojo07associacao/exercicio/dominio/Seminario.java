package academy.devdojo.maratonajava.orientacaoobjetos.devdojo07associacao.exercicio.dominio;

public class Seminario {
	private String titulo;
	private Estudante[] estudantes;
	private Local local;

	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}

	public Seminario(String titulo, Estudante[] estudantes, Local local) {
		this.titulo = titulo;
		this.estudantes = estudantes;
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
