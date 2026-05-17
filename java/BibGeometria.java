/**
    @see "Desafio: composicao de objetos e metodos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 17/05/2026

    Você se ingressou na equipe de desenvolvimento de um projeto open-source que visa criar uma 
    biblioteca Java com diversas classes e métodos que calculam diversas fórmulas matemáticas simples ou complexas.

    Esse projeto será muito importante para o mercado acadêmico e corporativo, pois os programadores não precisarão mais 
    conhecer as fórmulas matemáticas a fundo para desenvolverem aplicações e jogos que necessitam delas.

    O líder do projeto passou uma atividade para você:

    Crie uma classe que servirá para agrupar métodos que calculam áreas de diversas formas geométricas. Pense em um nome legal para essa classe.

    Agora, implemente um método estático nessa classe para calcular a área de um quadrado, a partir da medida de qualquer lado desse quadrado.

    A fórmula para calcular a área de um quadrado é:

        área do quadrado = lado²

    Depois que fizer isso, implemente um novo método para calcular a área de um círculo, dado um raio. A fórmula matemática neste caso é:

        área do círculo = raio² * π

    Você precisa saber: π (pronuncia-se "pi") é uma constante com o valor igual a 3.14159265358979323846.

    Ao finalizar o desenvolvimento dos métodos utilitários, crie uma nova classe com o método main para testar os cálculos.

*/

public class BibGeometria {
    public static void main(String[] args) {
        System.out.printf("A area do quadrado com lados 5 e: %f%n", Geo.areaQuadrado(5));
        System.out.printf("A area do circulo com raio 2 e: %f%n", Geo.areaCirculo(2));

    }
}

class Geo {
    private static final double PI = 3.14159265358979323846;

    static double areaQuadrado(double lado) {
        return lado * lado;
    }

    static double areaCirculo(double raio) {
        return (raio * raio) * PI;
    }
}
