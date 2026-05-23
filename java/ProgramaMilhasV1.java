/**
    @see "Desafio: pacotes e modificadores de acesso"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

    O desenvolvedor sênior avaliou o seu código e pediu para que você fizesse algumas melhorias:

     x Organização das classes em pacotes (considere que o domínio na internet da empresa onde você trabalha é algamilhas.com.br)
     - Especificar os modificadores de acesso nos membros da classe Participante
     - Implementar um método creditarPontos, que soma a quantidade de pontos recebida como argumento no saldo

    Veja os detalhes no diagrama de classes que ele te enviou:

    ----------------------------------------------------------
    |                     Participante                       |
    ----------------------------------------------------------
    | -nome: String                                          |
    | -saldoDePontos: int                                    |
    ----------------------------------------------------------
    | +Participante(nome: String)                            |
    | +Participante(nome: String, saldoDePontosInicial: int) |
    | +creditarPontos(pontos: int): void                     |
    ----------------------------------------------------------

    Depois que implementar, note o que deixou de funcionar na classe Principal.

*/

public class ProgramaMilhasV1 {
    public static void main(String[] args) {
        ParticipanteV1 participante1 = new ParticipanteV1("Jose");
        ParticipanteV1 participante2 = new ParticipanteV1("Maria", 2500);

        System.out.println(participante1.getNome() + " -> Pontos: " + participante1.getSaldoDePontos());
        System.out.println("------");
        System.out.println(participante2.getNome() + " -> Pontos: " + participante2.getSaldoDePontos());

        participante1.creditarPontos(5000);

        System.out.println("*********************");

        System.out.println(participante1.getNome() + " -> Pontos: " + participante1.getSaldoDePontos());
        System.out.println("------");
        System.out.println(participante2.getNome() + " -> Pontos: " + participante2.getSaldoDePontos());
    }
    
}


class ParticipanteV1 {

    private String nome;
    private int saldoDePontos;

    public ParticipanteV1(String nome) {
        setNome(nome);
    }

    public ParticipanteV1(String nome, int saldoDePontosInicial) {
        this(nome);
        setSaldoDePontos(saldoDePontosInicial);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldoDePontos() {
        return this.saldoDePontos;
    }

    public void setSaldoDePontos(int saldoDePontos) {
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos(int pontos) {
        int pontosTotais = getSaldoDePontos() + pontos;
        setSaldoDePontos(pontosTotais);
    }
}
