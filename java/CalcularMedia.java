/**
    @see "Desafio: Arrays"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

    Implemente um método de uma classe para calcular a média de números do tipo double.

    Este método deve exigir no mínimo 2 números para o cálculo, sendo ilimitada a quantidade máxima.

    Use varargs para conseguir isso, usando as boas práticas que você aprendeu.

*/


public class CalcularMedia {
    static double media(double num1, double num2, double... numeros) {

        double soma = num1 + num2;
        int count = 2;

        if(numeros.length != 0) {
            for(double numero : numeros) {
                soma += numero;
                count++;
            }
        }

        return soma / count;
    }

    public static void main(String[] args) {
        System.out.println(CalcularMedia.media(59.2, 89.2, 10.2, 104.2, 78));            // 68.16
        System.out.println(CalcularMedia.media(59.2, 89.2));                             // 74.2
        System.out.println(CalcularMedia.media(59.2, 89.2, 10.2, 104.2));                // 65.7
        System.out.println(CalcularMedia.media(59.2, 89.2, 10.2));                       // 52.8666667
    }
    
}
