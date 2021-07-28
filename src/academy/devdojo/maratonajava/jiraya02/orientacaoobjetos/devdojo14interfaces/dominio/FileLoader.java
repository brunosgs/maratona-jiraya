package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo14interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Carrega dados de um arquivo");
	}

	@Override
	public void remove() {
		System.out.println("Deletando dados de um arquivo");
	}

}
