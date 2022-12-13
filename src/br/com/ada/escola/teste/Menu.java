package br.com.ada.escola.teste;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-----------Bem vind@ ao nosso sistema escolar------------|");
        System.out.println("Você é: \n [1] - Funcionário \n [2]  - Pai ou responsável \n [3] - Aluno \n [4] - Sair");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                //funções funcionário - refatorar código
                break;
            case 2:
                //Funções - consultar cadastro, consultar nota filho
                break;
            case 3:
                //dar boas vindas
                //consultar nota
                break;
            case 4:
                System.out.println("Encerrado o sistema... Aguarde...");
            default :
                System.out.println("A opção selecionada não existe");
        }

        //

        System.out.println("Obrigad@ por usar nosso sistema!");
    }

}
