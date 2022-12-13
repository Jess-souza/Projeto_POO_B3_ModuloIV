package br.com.ada.escola.modelo;

public class Endereco {
    private String rua;
    private int numero;
    private String estado;

    public Endereco(String rua, int numero, String estado) {
        this.rua = rua;
        this.numero = numero;
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
                "\nEstado: " + estado;
    }
}

