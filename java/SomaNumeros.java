import java.util.Scanner;

/**
    @see "Desafio: Estruturas de Repeticao"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Escreva um programa que solicita números inteiros para o usuário de forma "infinita",
    até que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após informar cada número).

    Some todos os números ímpares e todos os números pares e imprima na saída o resultado.
*/

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char escolha;
        int somaPares = 0;
        int somaImpares = 0;

        do {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();

            if (CheckEntradas.ePar(numero)) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }

            System.out.print("%nDeseja digitar mais numero (S/N): ");
            escolha = entrada.next().charAt(0);

        } while(CheckEntradas.eParaTerminar(escolha));
       
        System.out.printf("%nA soma dos numero pares e: %d%n", somaPares);
        System.out.printf("A soma dos numero impares e: %d%n", somaImpares);
    }
    
}

class CheckEntradas {

    static boolean ePar(int numero) {
        return (numero % 2 == 0);
    }

    static boolean eParaTerminar(char caracter) {
        return (Character.toUpperCase(caracter) == 'S');
    }


}
