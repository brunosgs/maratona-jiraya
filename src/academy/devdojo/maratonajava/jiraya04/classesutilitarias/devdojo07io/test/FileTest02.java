package academy.devdojo.maratonajava.jiraya04.classesutilitarias.devdojo07io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) {
		File diretorio = new File("pasta");
		boolean isDiretorioCreated = diretorio.mkdir();
		System.out.println("Diretório criado?: " + isDiretorioCreated);

		File arquivoDiretorio = new File(diretorio, "arquivo.txt");

		try {
			boolean isFileCreated = arquivoDiretorio.createNewFile();
			System.out.println("Arquivo criado?: " + isFileCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}

		File fileRenamed = new File(diretorio, "arquivo_renomeado.txt");
		boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
		System.out.println("Arquivo no diretório renomeado?: " + isRenamed);

		File diretorioRenamed = new File("pasta2");
		boolean isRenamedDiretorio = diretorio.renameTo(diretorioRenamed);
		System.out.println("Diretório renomeado?: " + isRenamedDiretorio);

	}

}
