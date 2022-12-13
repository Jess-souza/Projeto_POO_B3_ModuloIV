package br.com.ada.escola.businessobject;

import br.com.ada.escola.enumeracao.Disciplina;
import br.com.ada.escola.modelo.Professor;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Scanner;


public class Rh {

    public static List<Professor> professoresContratados = new ArrayList<>();

    public void contratarProfessor(Disciplina disciplina, Double salario, Professor professor) {
        if (Objects.nonNull(professor)) {
            professor.setDisciplina(disciplina);
            professor.setSalario(salario);
            professoresContratados.add(professor);
            System.out.println("Professor(a), " + professor.getNome() + ", contratado(a) com sucesso");
            System.out.println(" ");
        } else {
            System.out.println("Não foi possível contratar o(a) professor(a). Por favor, verificar se todos os dados foram fornecidos.");
            System.out.println(" ");
        }
    }

    public void darAumentoProfessor(Professor professor, Double valorAumento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        Double novoSalario = professor.getSalario() + valorAumento;
        professor.setSalario(novoSalario);
        System.out.println("Aumento de R$" + valorAumento + " para o(a) professor(a) " + professor.getNome() + " concedido com sucesso.");
        System.out.println("O valor do novo sário é de R$" + professor.getSalario());
        System.out.println(" ");
    }

}

