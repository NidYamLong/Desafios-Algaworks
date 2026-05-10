import java.util.Scanner;

/**
    @see "Desafio: calculadora complexa de IMC"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 10/05/2026

    Em aulas anteriores, nós implementamos as regras da Organização Mundial de Saúde para calcular o IMC (Índice de Massa Corporal).

    Existem outras regras mais detalhadas, como as da NHANES II survey (USA 1976-1980), que indicam os seguintes critérios para adultos:
    |-----------------------------------------------------------------|
    |    Condição            |	IMC em mulheres   | IMC em homens     |
    | Abaixo do peso         |	Menor que 19.1 	  | Menor que 20.7    |
    | No peso ideal          | 	Entre 19.1 e 25.8 | Entre 20.8 e 26.4 |
    | Um pouco acima do peso | 	Entre 25.9 e 27.3 |	Entre 26.5 e 27.8 |
    | Acima do peso ideal    | 	Entre 27.4 e 32.3 | Entre 27.9 e 31.1 |
    | Obeso                  | 	Maior que 32.3    | Maior que 31.1    |
    |-----------------------------------------------------------------|

    Implemente um programa que obtém os valores como entrada do usuário e imprime na tela o resultado (condição da pessoa),
    usando essas regras e aplicando todos os conteúdos que você aprendeu até agora neste módulo.
*/

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu genero ( F /Feminino) ou ( M /Masculino): ");
        char genero = Character.toUpperCase(entrada.next().charAt(0));

        System.out.print("\nDigite a sua altura (EX: 1.89): ");
        float altura = entrada.nextFloat();

        System.out.print("\nDigite o seu peso (EX: 65.9):");
        float peso = entrada.nextFloat();


        // calculo imc
        float imc = peso / (altura*altura);


        System.out.println();

        if(genero == 'M') {
            if(imc <= 20.7) {
                System.out.println(">> Abaixo do peso");

            } else if(imc >= 20.8 && imc <= 26.4) {
                System.out.println(">> No peso ideal");

            } else if(imc >= 26.5 && imc <= 27.8) {
                System.out.println(">> Um pouco acima do peso");

            } else if(imc >= 27.9 && imc <= 31.1) {
                System.out.println(">> Acima do peso ideal");

            } else {
                System.out.println(">> Obeso");
            }
        }

        if(genero == 'F') {
            if(imc < 19.1) {
                System.out.println(">> Abaixo do peso");

            } else if(imc >= 19.1 && imc <= 25.8) {
                System.out.println(">> No peso ideal");

            } else if(imc >= 25.9 && imc <= 27.3) {
                System.out.println(">> Um pouco acima do peso");

            } else if(imc >= 27.4 && imc <= 32.3) {
                System.out.println(">> Acima do peso ideal");

            } else {
                System.out.println(">> Obeso");
            }
        }

    }
    
}
