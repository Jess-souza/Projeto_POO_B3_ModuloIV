package br.com.ada.escola.modelo;

public class PaiOuResponsavel extends Pessoa {
    private String profissao;
    private String numeroTelefone;

    public PaiOuResponsavel(String nome, int idade, String rg, String cpf, Endereco endereco, String profissao, String numeroTelefone) {
        super(nome, idade, rg, cpf, endereco);
        this.profissao = profissao;
        this.numeroTelefone = numeroTelefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nProfissão: " + profissao +
                "\nTelefone " + numeroTelefone;
    }
}

