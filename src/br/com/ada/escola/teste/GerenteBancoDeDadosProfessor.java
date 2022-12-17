package br.com.ada.escola.teste;

import br.com.ada.escola.modelo.Pessoa;
import br.com.ada.escola.modelo.Professor;

import java.io.*;
import java.util.ArrayList;

public class GerenteBancoDeDadosProfessor {
    public ArrayList<Pessoa> professores = new ArrayList<>();

    public GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    public ArrayList<Pessoa> retonarProfessor() {
        return professores;
    }

    public void cadastrarProfessor(Pessoa professor) {
        var file = gerenteDeArquivo.getArquivoDeBanco("professor.txt");
        professores.add(professor);
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Pessoa item : professores) {
                out.writeObject(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        carregarDados();
    }

    public void carregarDados() {
        professores.clear();
        var file = gerenteDeArquivo.getArquivoDeBanco("professor.txt");
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Professor c) {
                    professores.add(c);
                }
            }
        } catch (Exception e) {
        }
    }
}
