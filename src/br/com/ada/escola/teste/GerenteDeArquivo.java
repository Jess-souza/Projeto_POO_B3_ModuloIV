package br.com.ada.escola.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GerenteDeArquivo {

    private final String caminhoDoBackup = "src/resources/backup/";
    private final String caminhoDoArquivo = "src/resources/banco/";

    public void criarArquivoDeBanco(String nomeDoArquivo) throws IOException {
        File novoArquivo = new File(caminhoDoArquivo + nomeDoArquivo);
        if (novoArquivo.createNewFile()) {
            System.out.println("O arquivo foi criado com sucesso");
        } else {
            System.out.println("O arquivo não foi criado");
        }
    }

    public void apagarArquivoDeBanco(String nomeDoArquivo) {
        Path path = Path.of(caminhoDoArquivo + nomeDoArquivo);
        File arquivo = path.toFile();
        if (arquivo.delete()) {
            System.out.println("O arquivo foi deletado com sucesso");
        } else {
            System.out.println("O arquivo não foi deletado");
        }
    }

    public void fazerBackupArquivoDeBanco(String nomeDoArquivo) throws IOException {
        Files.copy(Path.of(caminhoDoArquivo + nomeDoArquivo), Path.of(caminhoDoBackup + nomeDoArquivo));
    }

    public File getArquivoDeBanco(String nomeDoArquivo) {
        return Path.of(caminhoDoArquivo + nomeDoArquivo).toFile();
    }
}
