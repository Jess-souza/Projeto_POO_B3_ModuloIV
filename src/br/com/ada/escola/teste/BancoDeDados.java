package br.com.ada.escola.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BancoDeDados {
    static String nomeArquivo = "C:/Users/Usuário/IdeaProjects/Projeto_POO_B3_ModuloIV/src/resoucers/files/teste.txt";
    public static void main(String[] args) throws IOException {
        File testeFile = new File(nomeArquivo);
        System.out.println("Se existe: " + testeFile.exists());

        Path path = Paths.get(nomeArquivo);
        File testeFile2 = path.toFile();
        System.out.println("Se existe: " + testeFile2.exists());

        Files.createDirectories(Path.of(nomeArquivo));
    }
}
