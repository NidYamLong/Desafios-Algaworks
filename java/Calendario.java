/**
    @see "Desafio: Arrays"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 23/05/2026

    1) Refatore o código da classe Calendario, substuindo o switch expression por uma lógica usando arrays,
        sem usar qualquer tipo de estrutura condicional, como switch e if.

        public class Calendario {

            static String obterNomeMes(int numeroMes) {
                return switch (numeroMes) {
                    case 1 -> "Janeiro";
                    case 2 -> "Fevereiro";
                    case 3 -> "Março";
                    case 4 -> "Abril";
                    case 5 -> "Maio";
                    case 6 -> "Junho";
                    case 7 -> "Julho";
                    case 8 -> "Agosto";
                    case 9 -> "Setembro";
                    case 10 -> "Outubro";
                    case 11 -> "Novembro";
                    case 12 -> "Dezembro";
                    default -> null;
                };
            }

            public static void main(String[] args) {
                String mes = Calendario.obterNomeMes(9);

                System.out.println(mes);
            }

        }
*/


public class Calendario {

    static String obterNomeMes(int numeroMes) {
        String[] nomeMes = {
            "Janeiro", 
            "Fevereiro", 
            "Março", 
            "Abril", 
            "Maio", 
            "Junho", 
            "Julho", 
            "Agosto", 
            "Setembro", 
            "Outubro", 
            "Novembro", 
            "Dezembro"
        };

        return nomeMes[numeroMes-1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);

        System.out.println(mes);

    }
    
}
