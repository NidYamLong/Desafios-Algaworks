import java.util.Scanner;

/**
    @see "Desafio: estrutura switch e operador ternario"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 10/05/2026

    Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empréstimos para seus clientes,
    porém o contrato foi cancelado e você foi chamado para concluir a programação do sistema.

    O cliente também te informou que a taxa de juros da financeira depende da quantidade de parcelas:

        - 1 ou 2 parcelas: 1,99% ao mês
        - 3 parcelas: 2,99% ao mês
        - Outras quantidades de parcelas: 3,99% ao mês

    Além disso, caso o valor do empréstimo seja maior ou igual a 100, uma tarifa fixa será cobrada no valor de R$1,50.
*/

public class CalculoEmprestimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do emprestimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadedeParcelas = entrada.nextInt();

        double taxasJuros = 
            switch (quantidadedeParcelas) {
                case 1, 2 -> 1.99;
                case 3 -> 2.99;
                default -> 3.99;
            };


        double tarifaFixa = (valorEmprestimo >= 100)? 1.50 : 0;
        double totalJuros = valorEmprestimo * (taxasJuros / 100 * quantidadedeParcelas);
        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

        System.out.println();
        
        System.out.printf("\tTarifa Fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("\tTotal de Juros: R$%.2f%n", totalJuros);
        System.out.printf("\tCusto Total: R$%.2f%n", custoTotal);
    }
}
