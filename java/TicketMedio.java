/**
    @see "Desafio: Variaveis e Operadores Aritmeticos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 10/05/2026

    Um comerciante está curioso para saber o ticket médio das últimas 3 vendas que fez em sua loja
    e contratou você para desenvolver um programa que resolva isso.

    Como você ainda não aprendeu a receber entrada de dados pelo usuário,
    você pediu ao comerciante os valores das 3 últimas vendas para incluir dentro do código-fonte do programa
    (mas prometeu arrumar isso assim que aprendesse).

    O comerciante te passou os seguintes valores: 20, 30 e 100.

    Desenvolva um programa que calcula a média desses números e exibe na saída.

    ## Testes gerados pelo ChaGPT:
    Prompt:
        gere dez linhas com tres numeros aleatorios 
        e subtitua os simbolos %s1, %s2 e %s3 por eles com a seguinte estrutura: 
        System.out.println(Calculo.media(%s1, %s2, %s3));
*/

public class TicketMedio {
    public static void main(String[] args) {
        System.out.println(Calculo.media(20, 30, 100));   // 50.0
        System.out.println(Calculo.media(12, 47, 89));    // 49.33333
        System.out.println(Calculo.media(34, 56, 78));    // 56.0
        System.out.println(Calculo.media(91, 23, 65));    // 59.66666
        System.out.println(Calculo.media(17, 88, 42));    // 49.0
        System.out.println(Calculo.media(73, 19, 54));    // 48.66666
        System.out.println(Calculo.media(28, 64, 95));    // 62.33333
        System.out.println(Calculo.media(45, 11, 82));    // 46.0
        System.out.println(Calculo.media(66, 39, 14));    // 39.66666
        System.out.println(Calculo.media(52, 97, 31));    // 60.0
        System.out.println(Calculo.media(84, 26, 58));    // 56.0
        
    }
}


class Calculo {
    static float media(int valor1, int valor2, int valor3) {
        return (float)(valor1+valor2+valor3)/3;
    }
}