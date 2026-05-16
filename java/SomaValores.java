import java.util.Scanner;

/**
    @see "Desafio: Estruturas de Repeticao"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma todos os números informados.

    O programa deve parar de solicitar mais números e imprimir a soma deles na saída
    apenas quando o valor total somado for igual ou superior a 100.
*/

public class SomaValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        
        while (soma < 100) {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();

            soma += numero;

            System.out.printf("%nA soma dos numero esta em:%d%n%n", soma);
        }
    }
}
