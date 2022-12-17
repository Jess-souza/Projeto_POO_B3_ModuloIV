package br.com.ada.escola.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {
    private int matricula;
    private Double nota;
    private PaiOuResponsavel paiOuResponsavel;
    private boolean aprovado;
    private boolean formado;

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean isFormado() {
        return formado;
    }


    public void setFormado(boolean formado) {
        this.formado = formado;
    }

    public Aluno(String nome, int idade, String rg, String cpf, Endereco endereco, PaiOuResponsavel paiOuResponsavel) {
        super(nome, idade, rg, cpf);
        this.paiOuResponsavel = paiOuResponsavel;
    }

    public Aluno(PaiOuResponsavel paiOuResponsavel) {
        this.paiOuResponsavel = paiOuResponsavel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public PaiOuResponsavel getPaiOuResponsavel() {
        return paiOuResponsavel;
    }

    public void setPaiOuResponsavel(PaiOuResponsavel paiOuResponsavel) {
        this.paiOuResponsavel = paiOuResponsavel;
    }

    @Override
    public String toString() {
        return "\nAluno: " +
                super.toString() +
                "\nMatrícula: " + matricula +
                "\nPai ou responsável:" + paiOuResponsavel.getNome();
    }

    public static class Cadastro {

        public static List<Aluno> alunosMatriculados = new ArrayList<>();

        public void matricularAlunos(Aluno aluno, int matricula) {
            if (Objects.nonNull(aluno) && Objects.nonNull((aluno.getPaiOuResponsavel()))) {
                aluno.setMatricula(matricula);
                alunosMatriculados.add(aluno);
                System.out.println("Matricula do aluno " + aluno.getNome() + " foi realizada com sucesso.");
                System.out.println(" ");
            } else {
                System.out.println("Não foi possível matricular o aluno. Por favor, verificar se foi atribuido um pai ou responsável para o aluno");
                System.out.println(" ");
            }
        }

        public static List<PaiOuResponsavel> paiOuResponsavelCadastrado = new ArrayList<>();

        public void cadastrarPaiOuResponsavel(PaiOuResponsavel paiOuResponsavel) {
            if (Objects.nonNull(paiOuResponsavel)) {
                paiOuResponsavelCadastrado.add(paiOuResponsavel);
                System.out.println("Aluno.Cadastro do responsável " + paiOuResponsavel.getNome() + " foi realizado com sucesso.");
                System.out.println(" ");
            } else {
                System.out.println("Não foi possível cadastrar o pai ou responsável. Por favor, verificar se todos os dados foram fornecidos.");
                System.out.println(" ");
            }
        }
    }
}
