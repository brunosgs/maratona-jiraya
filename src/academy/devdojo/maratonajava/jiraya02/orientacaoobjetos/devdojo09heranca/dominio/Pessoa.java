package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo09heranca.dominio;

// PROTECTED: Qualquer subclasse em qualquer pacote, tera acesso aos atributos como se tivesse o atributo na propria classe.
public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;

	static {
		System.out.println("Dentro do bloco de inicialização estático de Pessoa");
	}

	{
		System.out.println("Dentro do bloco inicialização de Pessoa 1");
	}

	{
		System.out.println("Dentro do bloco inicialização de Pessoa 2");
	}

	public Pessoa(String nome) {
		System.out.println("Dentro do construtor de Pessoa");
		this.nome = nome;
	}

	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("** Endereço **");
		System.out.println("Rua: " + this.endereco.getRua());
		System.out.println("CEP: " + this.endereco.getCep());
	}

}
