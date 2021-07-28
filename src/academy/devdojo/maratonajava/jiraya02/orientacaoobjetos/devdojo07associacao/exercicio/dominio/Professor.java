package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public void imprime() {
		System.out.println("------------------------------");
		System.out.println("Professor: " + this.nome);

		if (this.seminarios == null) {
			System.out.println("------------------------------");

			return;
		}

		System.out.println("** Seminários cadastrados **");

		for (Seminario seminario : seminarios) {
			System.out.println("Titulo: " + seminario.getTitulo());
			System.out.println("Endereço: " + seminario.getLocal().getEndereco());

			if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0) {
				System.out.println("------------------------------");

				continue;
			}

			System.out.println("** Estudantes **");

			for (Estudante estudante : seminario.getEstudantes()) {
				System.out.println("Nome: " + estudante.getNome());
				System.out.println("Idade: " + estudante.getIdade());
			}
		}

		System.out.println("---------------FIM---------------");
	}

}
