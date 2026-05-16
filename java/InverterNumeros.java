
import java.util.Scanner;

/**
    @see "Desafio: Estruturas de Repeticao"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o número com os dígitos invertidos.

    Por exemplo, se o número digitador for 98765, a saída deve ser 56789.
*/

public class InverterNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.printf("%nO numero inverso e: %s%n", Inverter.numeros(numero));
        
    }
    
}

class Inverter {

    static String numeros(int numero) {
        String numeroInverso = "";

        while (numero > 0) {
            int digito = numero % 10;
            numero /= 10;

            numeroInverso += digito;
        }

        return numeroInverso;
    }
}
