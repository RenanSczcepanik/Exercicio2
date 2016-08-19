package br.edu.uricer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Processador {

    List<Integer> lista = new ArrayList<>();

    public Processador(List<Integer> valores) {
        lista = valores;
    }
    public int getMinimo() {
        return Collections.min(lista);
    }
    public int getMaximo() {
        return Collections.max(lista);
    }
    public int calculaSoma() {
        int soma = 0;
        for (int i : lista) {
            soma += i;
        }
        return soma;
    }
    public double getValorMedio() {
        int soma = calculaSoma();
        return soma / (double) lista.size();
    }
    public int getTamanho(){
        return lista.size();
    }
}
