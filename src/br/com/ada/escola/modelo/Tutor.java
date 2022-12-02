package br.com.ada.escola.modelo;

import br.com.ada.escola.businessobject.Rh;

import java.util.Date;

public class Tutor extends Pessoa implements FuncoesFuncionario, Funcionario {
    Double salario;
    Date dataHoraAtual = new Date();

    public Tutor(String nome, int idade, String rg, String cpf, Endereco endereco) {
        super(nome, idade, rg, cpf, endereco);
    }

    public Tutor() {
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void darAdvertencia(Aluno aluno) {
        System.out.println("Aluno " + aluno.getNome() + " recebeu uma advertência.");
    }

    @Override
    public void lancarNota(Aluno aluno, Double nota) {
        aluno.setNota(nota);
    }

    @Override
    public void aprovarAluno(Aluno aluno) {
        if (aluno.getNota() >= 7 ) {
            aluno.setAprovado(true);
        } else {
            aluno.setAprovado(false);
            System.out.println("O aluno não foi aprovado e terá que ir para a recuperação");
        }
    }

    public void ajudarAluno(Aluno aluno) {
        System.out.println("Marcando monitoria com o(a) aluno(a) " + aluno.getNome() + " para " + dataHoraAtual);
    }

    @Override
    public void consultarSalario(Funcionario funcionario) {
        System.out.println("O salário do(a) funcionário(a) " + this.getNome() +" é R$" + this.getSalario());
    }

    @Override
    public void pedirDesligamento(Funcionario funcionario) {
        System.out.println("Eu, tutor, " + this.getNome() + ", estou pedindo desligamento da escola.");
        Rh.tutoresContratados.remove(funcionario);
        this.setSalario(0.0);
    }

    @Override
    public String toString() {
        return "Tutor: \n" +
                super.toString() +
                "\nSalário: " + salario;
    }
}

