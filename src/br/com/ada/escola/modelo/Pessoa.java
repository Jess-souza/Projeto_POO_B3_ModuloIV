package br.com.ada.escola.modelo;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String rg;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String rg, String cpf, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nIdade: " + idade;
    }
}

