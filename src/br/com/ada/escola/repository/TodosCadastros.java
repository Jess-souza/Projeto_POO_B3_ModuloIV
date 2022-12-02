package br.com.ada.escola.repository;

public class TodosCadastros <T> {

    public void mostrarLista(T t) {
        System.out.println("########## Mostrando lista #########");
        System.out.println(t);
        System.out.println("########### Fim da lista ###########");
    }
}
