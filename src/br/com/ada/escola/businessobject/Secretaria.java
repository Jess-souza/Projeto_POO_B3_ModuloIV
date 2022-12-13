package br.com.ada.escola.businessobject;

import br.com.ada.escola.modelo.Aluno;
import br.com.ada.escola.modelo.FuncoesFuncionario;

public class Secretaria implements FuncoesFuncionario {
        @Override
        public void lancarNota(Aluno aluno, Double nota) {
            aluno.setNota(nota);
        }

        @Override
        public void aprovarAluno(Aluno aluno) {
            if (aluno.getNota() >=7 ) {
                aluno.setAprovado(true);
            } else {
                aluno.setAprovado(false);
                System.out.println("O aluno não foi aprovado e terá que ir para a recuperação");
            }
        }

        public void cadastrarMatriculaAluno(Aluno aluno, int matricula) {
            aluno.setMatricula(matricula);
        }

        public Secretaria() {
        }

        public Aluno.Cadastro cadastro = new Aluno.Cadastro();

    }
