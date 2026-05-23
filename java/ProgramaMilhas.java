/**
    @see "Desafio: Construtores"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

    Você trabalha em uma startup de programa de milhas que está começando a desenvolver seu sistema agora, para concorrer com a Smiles, Livelo, etc.

    A primeira classe para começar codificar já foi modelada em um diagrama de classes por um colega sênior da empresa, que pediu para você implementar em código Java.

    ----------------------------------------------------------
    |                     Participante                       |
    ----------------------------------------------------------
    | +nome: String                                          |
    | +saldoDePontos: int                                    |
    ----------------------------------------------------------
    | +Participante(nome: String)                            |
    | +Participante(nome: String, saldoDePontosInicial: int) |
    ----------------------------------------------------------

    Transforme esse diagrama em código, usando o que você aprendeu nas últimas aulas desse módulo, para criar os construtores, validar os argumentos, etc.

    Depois, crie uma classe Principal para testar a instanciação de objetos do tipo Participante.

*/


public class ProgramaMilhas {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Jose");
        Participante participante2 = new Participante("Maria", 2500);

        System.out.println(participante1.nome);
        System.out.println("------");
        System.out.println(participante2.nome + " -> Pontos: " + participante2.saldoDePontos);
        
    }
    
}

class Participante {

    String nome;
    int saldoDePontos;

    public Participante(String nome) {
        this.nome = nome;
    }

    public Participante(String nome, int saldoDePontosInicial) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }
}
