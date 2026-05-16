
import java.util.Scanner;

/**
    @see "Desafio: Estruturas de Repeticao"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Escreva um programa que solicita um número inteiro positivo para o usuário e
    imprime na saída uma mensagem dizendo se o número digitado é um número primo ou não.

    Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.

    Por exemplo, o número 1 não é um número primo, porque ele tem apenas o número 1 (ele mesmo) como divisor.
    O número 2 é primo, porque ele é divisível por 1 e ele mesmo. O número 4 não é primo, porque ele é divisível por 1, 2 e 4.

    Para saber se um número é divisível por outro, basta usar o operador de módulo (resto) e avaliar se é igual a 0.
*/

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.printf("%nO numero %d e primo: %b%n", numero, Prime.isPrime(numero));
        
    }
}


class Prime {
    static boolean isPrime(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}


