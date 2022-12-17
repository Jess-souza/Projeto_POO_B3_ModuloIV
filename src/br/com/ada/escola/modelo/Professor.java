package br.com.ada.escola.modelo;

import br.com.ada.escola.enumeracao.Disciplina;
import br.com.ada.escola.teste.GerenteBancoDeDadosProfessor;

import java.time.LocalDateTime;

public class Professor extends Pessoa implements FuncoesFuncionario {


    private GerenteBancoDeDadosProfessor gerenteBancoDeDados;

    public Professor(GerenteBancoDeDadosProfessor gerenteBancoDeDados) {
        this.gerenteBancoDeDados = gerenteBancoDeDados;
    }

    private Double salario;
    private Disciplina disciplina;
    private LocalDateTime dataHora;

    public Professor(String nome, int idade, String rg, String cpf) {
        super(nome, idade, rg, cpf);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public void lancarNota(Aluno aluno, Double nota) {
        aluno.setNota(nota);
    }

    @Override
    public void aprovarAluno(Aluno aluno) {
        if (aluno.getNota() >= 7) {
            aluno.setAprovado(true);
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " foi aprovado(a).");
            System.out.println(" ");
        } else {
            aluno.setAprovado(false);
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " não foi aprovado(a) e terá que ir para a recuperação.");
            System.out.println(" ");
        }
    }

    public void ajudarAluno(Aluno aluno, LocalDateTime dataHora) {
        System.out.println("Marcando monitoria com o(a) aluno(a) " + aluno.getNome() + " para " + dataHora);
    }
}

