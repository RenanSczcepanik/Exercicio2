package br.edu.uricer;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProcessadorTest {

    ArrayList<Integer> lista;

    public ProcessadorTest() {
        this.lista = new ArrayList<>();
        lista.add(6);
        lista.add(9);
        lista.add(15);
        lista.add(-2);
        lista.add(92);
        lista.add(11);
    }
    @Test
    public void testValorMinimo() {
        Processador teste = new Processador(lista);
        assertEquals(-2, teste.getMinimo());
    }

    @Test
    public void testValorMaximo() {
        Processador teste = new Processador(lista);
        assertEquals(92, teste.getMaximo());
    }

    @Test
    public void testValorMedio() {
        Processador teste = new Processador(lista);
        double numero = 21.833333;
        assertEquals(numero, teste.getValorMedio(), numero);
    }

    @Test
    public void testTamanho() {
        Processador teste = new Processador(lista);
        assertEquals(6, teste.getTamanho());
    }
}
