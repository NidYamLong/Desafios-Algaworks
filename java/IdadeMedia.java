/**
    @see "Desafio: promocao aritmetica"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 10/05/2026

    Um programador Java iniciante está desenvolvendo um programa que deve calcular a idade média de 3 pessoas,
    porém o resultado deve ser com casas decimais.

    Ele já tentou alterar o tipo da variável idadeMedia para float,
    mas mesmo assim o resultado não é o que ele espera (os decimais sempre ficam zerados).

    Esse programador ficou sabendo que você está fazendo este curso e pediu a sua ajuda para resolver esse problema.
*/


public class IdadeMedia {
    public static void main(String[] args) {
        int idade1 = 30;
        int idade2 = 40;
        int idade3 = 60;

        float idadeMedia = (float)(idade1 + idade2 + idade3)/3;

        System.out.println("Idade Media: " + idadeMedia);
    }
    
}
