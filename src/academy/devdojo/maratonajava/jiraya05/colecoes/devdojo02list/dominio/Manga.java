package academy.devdojo.maratonajava.jiraya05.colecoes.devdojo02list.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
	private Long id;
	private String nome;
	private double preco;

	public Manga(Long id, String nome, double preco) {
		Objects.requireNonNull(id, "ID não pode ser null");
		Objects.requireNonNull(nome, "Nome não pode ser null");

		this.id = id;
		this.nome = nome;
		this.preco = preco;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		result = prime * result + (nome == null ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ temp >>> 32);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Manga other = (Manga) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco)) {
			return false;
		}
		return true;
	}

	/**
	 * Se o this < outroManga, retunr -1; Se o this == outroManga, return 0; Se o
	 * this > outroManga, return 1;
	 */
	@Override
	public int compareTo(Manga o) {
//		return Long.compare(this.id, o.getId());
//		return Double.compare(this.preco, o.getPreco());

		return this.nome.compareTo(o.getNome());

// Essa é outra lógica de comparação
//		if (this.id < o.getId()) {
//			return -1;
//		}
//
//		if (this.id.equals(o.getId())) {
//			return 0;
//		}
//
//		return 1;
	}

}
