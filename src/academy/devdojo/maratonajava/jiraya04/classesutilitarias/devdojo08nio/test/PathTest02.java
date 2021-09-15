package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo08nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		/* --- CRIANDO UM REPOSIT�RIO --- */
		Path pastaPath = Paths.get("pasta");

		if (Files.notExists(pastaPath)) {
			// Caso o diret�rio seja definido onde uma das subpastas n�o exista, ele vai
			// lan�ar uma exception. Nessa caso existe outro exemplo a seguir...
			Path pastaDirectory = Files.createDirectory(pastaPath);
		}

		/* --- CRIANDO UM REPOSIT�RIO COM SUB PASTAS --- */
		Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
		// Com createDirectories � criado todas as pastas e subpastas do comaninho
		// definido.
		Path subPastaDirectories = Files.createDirectories(subPastaPath);

		/* --- CRIANDO UM ARQUIVO --- */
		Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

		if (Files.notExists(filePath)) {
			Path filePathCreated = Files.createFile(filePath);
		}

		/* --- COPIA O ARQUIVO --- */
		Path source = filePath;
		Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
	}

}
