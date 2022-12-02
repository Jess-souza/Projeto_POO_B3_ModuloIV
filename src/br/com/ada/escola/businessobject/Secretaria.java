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


        @Override
        public void darAdvertencia(Aluno aluno) {
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " está recebendo advertência!");
        }

        public void ligarPaiOuResposanvel(Aluno aluno) {
            System.out.println("Ligando para o pai ou responsável do(a) aluno(a) " + aluno.getNome());
            System.out.println("Estamos ligando para " + aluno.getPaiOuResponsavel().getNome());
            System.out.println("Ligando para o número " + aluno.getPaiOuResponsavel().getNumeroTelefone());
        }

        public void emitirDiploma (Aluno aluno) {
            if (aluno.isAprovado() ==  true ) {
                System.out.println("O diploma do(a) aluno(a) " + aluno.getNome() + " foi emitido e agora o(a) mesmo(a) encontra-se formado(a).");
                aluno.setFormado(true);
            } else {
                System.out.println("O(a) aluno(a) "+ aluno.getNome() + " não foi aprovado(a), por isso não poderá se formar.");
            }

        }

        public Secretaria() {
        }

        public Aluno.Cadastro cadastro = new Aluno.Cadastro();

    }
