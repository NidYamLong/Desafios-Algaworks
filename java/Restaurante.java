import java.util.Arrays;

/**
    @see "Desafio: Arrays"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

   2) Uma software house está desenvolvendo um software para gestão de restaurantes e
   você foi designado para finalizar a implementação da classe Cardapio.

    Implemente os métodos, conforme as tarefas pendentes comentadas no código-fonte,
    usando o array de ItemCardapio. Depois, rode a classe Principal para fazer alguns testes.

*/

public class Restaurante {
    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);

        cardapio.removerItem(0);
        System.out.println("---");

        cardapio.imprimirItensCardapio(0, 150);
        
    }
    
}


class ItemCardapio {

    String descricao;
    double preco;

    @Override
    public String toString() {
        return descricao + ": " + preco;
    }
}


class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length+1);
        itens[itens.length-1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] itensAtualizado = new ItemCardapio[itens.length-1];

        System.arraycopy(itens, 0, itensAtualizado, 0, indice);
        System.arraycopy(itens, indice + 1, itensAtualizado, indice, itens.length - indice - 1);

        itens = itensAtualizado;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for(ItemCardapio item : itens) {
            if(item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.println(item);
            }
        }
    }

}