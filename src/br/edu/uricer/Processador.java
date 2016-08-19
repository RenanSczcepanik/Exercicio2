package br.edu.uricer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Processador {

    List<Integer> lista = new ArrayList<>();

    public Processador(List<Integer> valores) {
        lista = valores;
    }

    int getMinimo() {
        return Collections.min(lista);
    }

    int getMaximo() {
        return Collections.max(lista);
    }

    int calculaSoma() {
        int soma = 0;
        for (int i : lista) {
            soma += i;
        }
        return soma;
    }

    double getValorMedio() {
        int soma = calculaSoma();
        return (double) soma / (double) lista.size();
    }
    int getTamanho(){
        return lista.size();
    }
}
