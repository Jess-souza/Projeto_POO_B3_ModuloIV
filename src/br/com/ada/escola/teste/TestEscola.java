package br.com.ada.escola.teste;

import br.com.ada.escola.businessobject.Rh;
import br.com.ada.escola.businessobject.Secretaria;
import br.com.ada.escola.modelo.Aluno;
import br.com.ada.escola.modelo.Endereco;
import br.com.ada.escola.modelo.PaiOuResponsavel;
import br.com.ada.escola.modelo.Professor;
import br.com.ada.escola.repository.TodosCadastros;

import java.io.IOException;

public class TestEscola {

    static GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    static GerenteBancoDeDadosProfessor gerenteBancoDeDadosProfessor = new GerenteBancoDeDadosProfessor();

    public static void main(String[] args) throws IOException {
        System.out.println("|------------Inicializando as atividades escolares------------|");

        // Endereço genérico para testes
        Endereco enderecoGenerico = new Endereco("Rua Genérica", 3, "MG");

        //Instanciando classes
        //Professor criando o modelo de salvar o arquivo
        var gerenteDeArquivo = new GerenteDeArquivo();
        gerenteDeArquivo.criarArquivoDeBanco("professor");
        gerenteBancoDeDadosProfessor.cadastrarProfessor(
                new Professor(
                        "Lucas",
                        33,
                        "994.434.233-32",
                        "123.324.545-98"
                )
        );
        gerenteBancoDeDadosProfessor.retonarProfessor().forEach(System.out::println);

        //Pai
        Endereco enderecoMiguel = new Endereco("Rua Laranja", 25, "MG");
        PaiOuResponsavel miguel = new PaiOuResponsavel("Miguel Carlos", 45, "255.555", "888.888.888-88", enderecoMiguel);
        PaiOuResponsavel ana = new PaiOuResponsavel("Ana Maria", 50, "789.987", "159.753.789-65", enderecoGenerico);

        //Aluno
        Aluno joao = new Aluno("João Carlos", 10, "555.555", "058.974.532-22", enderecoMiguel, miguel);
        Aluno joana = new Aluno("Joana Maria", 11, "456.200", "852.654.741-55", enderecoGenerico, ana);
        Aluno larissa = new Aluno("Larissa Maria", 11, "753.654", "145.697.521-56", enderecoGenerico, ana);

        //Setores da escola
        //Rh
        Rh recursosHumanos = new Rh();
        //Secretaria
        Secretaria secretaria = new Secretaria();

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
        System.out.println(gerenteBancoDeDadosProfessor.retonarProfessor());
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
    }
}
