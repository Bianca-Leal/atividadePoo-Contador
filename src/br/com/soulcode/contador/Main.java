package br.com.soulcode.contador;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);

        System.out.println("Valor inicial do contador: " + contador.getValor());

        contador.incrementar();
        contador.incrementar();

        System.out.println("Valor atualizado do contador: " + contador.getValor());

        contador.zerar();

        System.out.println("Valor do contador após zerar: " + contador.getValor());
    }
}
