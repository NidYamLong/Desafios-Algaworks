import java.util.Scanner;

/**
    @see "Desafio: Estruturas de Repeticao"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.

    Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
    ignore e solicite um novo número ao usuário.
*/

public class NumerosPares {
    public static void main(String[] args) {

        int soma = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
           System.out.print("Digite um numero: ");
           int numero = entrada.nextInt();
           
           if (numero % 2 == 0) {
            soma += numero;
           } else {
            System.out.println("Erro!!! Digite apenas numeros pares");
           }
        }

        System.out.printf("A soma dos numeros pares digitados e: %d%n", soma);
    }
}