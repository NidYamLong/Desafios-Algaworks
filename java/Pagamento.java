/**
    @see "Desafio: composicao de objetos e metodos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 17/05/2026

    Uma empresa contratou você para continuar o desenvolvimento de um sistema de folha de pagamentos.

    A primeira funcionalidade que você deve desenvolver é o cálculo de salário de um funcionário.

    A empresa forneceu o seguinte código já desenvolvido para você continuar a implementação:

    public class FolhaPagamento {
        
        double calcularSalario() {
            // TODO implementar
        }

    }

    O método calcularSalario deve receber os seguintes parâmetros para calcular o valor total do salário a pagar:

        Quantidade de horas normais trabalhadas
        Quantidade de horas extras trabalhadas
        Valor da hora normal
        Valor da hora extra

    Você deve calcular as respectivas quantidades de horas trabalhas pelos valores da hora, somar os valores obtidos e retornar o resultado.

    Crie uma classe com o método main para invocar o método implementado e imprima o resultado (salário devido) na saída.
*/

public class Pagamento {
    public static void main(String[] args) {

        System.out.println(FolhaPagamento.calcularSalario(220, 32, 6.80, 15.30));
        
    }
}

class FolhaPagamento {
    static double calcularSalario(int qtdHorasTrabalhadas, int qtdHorasExtras, double valorHoraNormal, double valorHoraExtra) {

        double salarioBase = qtdHorasTrabalhadas * valorHoraNormal;
        double extraNoSalario = qtdHorasExtras * valorHoraExtra;

        return salarioBase + extraNoSalario;

    }
}