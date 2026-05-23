import java.util.ArrayList;

/**
    @see "Desafio: Arrays"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

   Refatore o código abaixo para usar ArrayList, no lugar de array.

*/

public class RestauranteV1 {
     public static void main(String[] args) {
        CardapioV1 cardapio = new CardapioV1();

        ItemCardapioV1 item1 = new ItemCardapioV1();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapioV1 item2 = new ItemCardapioV1();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapioV1 item3 = new ItemCardapioV1();
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


class ItemCardapioV1 {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return preco >= precoMinimo && preco <= precoMaximo;
    }

    void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}


class CardapioV1 {

    ArrayList<ItemCardapioV1> itens = new ArrayList<>();

    void adicionarItem(ItemCardapioV1 item) {
       itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapioV1 item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}