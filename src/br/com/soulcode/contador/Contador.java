package br.com.soulcode.contador;

public class Contador {
    private int valor;

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int novoValor) {
        this.valor = novoValor;
    }

    public void decrementar() {
        this.valor--;
    }
}
