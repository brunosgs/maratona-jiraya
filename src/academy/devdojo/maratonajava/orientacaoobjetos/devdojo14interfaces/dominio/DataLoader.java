package academy.devdojo.maratonajava.orientacaoobjetos.devdojo14interfaces.dominio;

// Nivel de acesso hierárquico: private -> default -> protected -> public
public interface DataLoader {
	public static final int MAX_DATA_SIZE = 10;

	abstract void load();

	public default void checkPermission() {
		System.out.println("Fazendo checagen de permissões");
	}

	public static void retrieveMaxDataSize() {
		System.out.println("Dentro da retrieveMaxDataSize na interface");
	}
}
