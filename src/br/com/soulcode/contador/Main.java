package br.com.soulcode.contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor_contador;


        System.out.println("Digite o valor para contador: ");
        valor_contador = leitura.nextInt();
        Contador c = new Contador(valor_contador);

        System.out.println("Valor do contador " + c.getValor());

        c.incrementar();
        c.incrementar();
        
        System.out.println("Valor do contador " + c.getValor());

        c.zerar();
        System.out.println("Valor do contador após zerar: " + c.getValor());
    }
}
