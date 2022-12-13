package br.com.ada.escola.teste;

import br.com.ada.escola.businessobject.Rh;
import br.com.ada.escola.businessobject.Secretaria;
import br.com.ada.escola.enumeracao.Disciplina;
import br.com.ada.escola.modelo.*;
import br.com.ada.escola.repository.TodosCadastros;

public class TestEscola {

    public static void main(String[] args) {
        System.out.println("|------------Inicializando as atividades escolares------------|");

        // Endereço genérico para testes
        Endereco enderecoGenerico = new Endereco("Rua Genérica", 3, "MG");

        //Instanciando classes
        //Professor
        Professor lucas = new Professor("Lucas", 33, "888.888", "369.456.025-98", enderecoGenerico);
        Professor maria = new Professor("Maria", 22, "777.777", "856.789.023-33", enderecoGenerico);
        Professor lucia = new Professor("Lucia", 25, "444.444", "789.455.611-11", enderecoGenerico);


        //Pai
        Endereco enderecoMiguel = new Endereco("Rua Laranja", 25, "MG");
        PaiOuResponsavel miguel = new PaiOuResponsavel("Miguel Carlos", 45, "255.555", "888.888.888-88", enderecoMiguel);
        PaiOuResponsavel ana = new PaiOuResponsavel("Ana Maria", 50, "789.987", "159.753.789-65", enderecoGenerico);


        //Aluno
        Aluno joao = new Aluno("João Carlos", 10, "555.555", "058.974.532-22", enderecoMiguel, miguel);
        Aluno joana = new Aluno("Joana Maria", 11, "456.200", "852.654.741-55", enderecoGenerico, ana);
        Aluno larissa = new Aluno("Larissa Maria", 11, "753.654", "145.697.521-56", enderecoGenerico, ana);

        //Setores da escola
        //RH
        Rh recursosHumanos = new Rh();
        //Secretaria
        Secretaria secretaria = new Secretaria();

        //Contratações de professores
        recursosHumanos.contratarProfessor(Disciplina.MATEMATICA, 5000.00, lucas);
        recursosHumanos.contratarProfessor(Disciplina.CIENCIAS, 5000.00, maria);
        recursosHumanos.contratarProfessor(Disciplina.ARTES, 5000.00, lucia);


        //Dar aumento professor
        recursosHumanos.darAumentoProfessor(lucia, 100.00);

        //Cadastrar pai ou responsável
        secretaria.cadastro.cadastrarPaiOuResponsavel(miguel);
        secretaria.cadastro.cadastrarPaiOuResponsavel(ana);

        //Matricular alunos
        secretaria.cadastro.matricularAlunos(joao, 565);
        secretaria.cadastro.matricularAlunos(joana, 566);
        secretaria.cadastro.matricularAlunos(larissa, 567);


        //Mostrar lista com matriculas e cadastros
        TodosCadastros todosCadastros = new TodosCadastros();

        //Lista de professores contratados
        System.out.println("|------Professores com contrato ativo-----|");
        todosCadastros.mostrarLista(Rh.professoresContratados);
        System.out.println("|-----------------------------------------|");
        System.out.println(" ");


        //Lista de alunos matriculados
        System.out.println("|----------Alunos matriculados------------|");
        todosCadastros.mostrarLista(Aluno.Cadastro.alunosMatriculados);
        System.out.println("|-----------------------------------------|");
        System.out.println(" ");

        //Lista de pais cadastrados
        System.out.println("|----Pais ou responsáveis cadastrados-----|");
        todosCadastros.mostrarLista(Aluno.Cadastro.paiOuResponsavelCadastrado);
        System.out.println("|-----------------------------------------|");
        System.out.println(" ");

        //lançar notas alunos
        lucas.lancarNota(joao, 5.0);
        lucas.lancarNota(larissa, 7.0);
        lucas.lancarNota(joana, 9.0);


        //Ajudando o aluno
        //karina.ajudarAluno(larissa);

        //Verificando se os alunos foram aprovados, e se foram, mudando o status para aprovado
        lucas.aprovarAluno(joao);
        lucas.aprovarAluno(larissa);
        lucas.aprovarAluno(joana);
    }
}
