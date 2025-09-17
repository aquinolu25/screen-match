package br.com.aquino.screenmatch.calculos;

import br.com.aquino.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
