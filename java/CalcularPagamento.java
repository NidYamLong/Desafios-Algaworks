
import java.util.Scanner;

/**
    @see "Desafio: String, entradade dados, printf etc."
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 10/05/2026

    A empresa que você trabalha descobriu que você está indo muito bem neste curso de Java e 
    pediu para que você desenvolvesse um programa que calcula os pagamentos para os prestadores de serviços da empresa.

    Este programa deve receber as seguintes entradas de dados do usuário:

    Nome (texto)
    Valor por hora (decimal)
    Horas trabalhadas (inteiro)
    Valor dos descontos (decimal)

    A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos e os resultados finais, como no exemplo abaixo:

                        Folha de pagamento: Thiago Faria
                        172 horas x R$150.20 = R$25834.40
                        Descontos: R$482.88
                        Total devido: R$25351.52

    Use a formatação de saída com printf para imprimir na saída e o tipo Scanner para receber a entrada de dados do usuário.
*/


public class CalcularPagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome = entrada.nextLine();

        System.out.print("\nDigite o Valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("\nDigite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("\nDigite o valor dos descontos aplicados: ");
        double valorDescontos = entrada.nextDouble();

        // Calculo Salario Bruto
        double salarioBruto = horasTrabalhadas*valorHora;

        // Calculo Salario Liquido
        double salarioLiquido = salarioBruto - valorDescontos;

        
        System.out.printf("\n\tFolha de Pagamaneto: %s \n", nome);
        System.out.printf("\t%d horas X R$%.2f = %.2f \n", horasTrabalhadas, valorHora, salarioBruto);
        System.out.printf("\tDescontos: R$%.2f \n", valorDescontos);
        System.out.printf("\tTotal devido: R$%.2f \n", salarioLiquido);

    }
    
}
