package br.com.ada.escola.modelo;

public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String bairro;
    private String estado;

    public Endereco(String rua, int numero, String cep, String bairro, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Endereco() {
    }

    ;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.equals("MG") || estado.equals("Minas Gerais")) {
            this.estado = estado;
        } else {
            System.out.println("O estado não pode ser diferente de Minas Gerais, pois a escola se localiza em Minas Gerais!");
        }
    }

    @Override
    public String toString() {
        return "\nEndereco: " +
                "\nRua:" + rua +
                "\nNúmero: " + numero +
                "\nCep: " + cep +
                "\nBairro: " + bairro +
                "\nEstado: " + estado;
    }
}

