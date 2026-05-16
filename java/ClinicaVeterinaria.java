/**
    @see "Desafio: instanciando objetos e acessando atributos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 16/05/2026

    Uma clínica veterinária te contratou para desenvolver um sistema de controle dos animais que eles cuidam.

    A prioridade é gerenciar os cachorros, que são a maior parte dos animais da clínica.

    O cliente te informou que precisa das seguintes informações dos cachorros: nome, raça, sexo e idade.

    A partir dessas informações:

    1) Crie um diagrama de classes (pode ser no StarUML ou com papel e caneta) para representar o domínio do problema

    2) Crie a classe Cachorro e adicione suas propriedades

    3) Crie uma classe Principal (com o método main), que instancia 2 objetos do tipo Cachorro

    4) Atribua valores às variáveis de instância dos objetos

    5) Acesse e imprima na saída os valores das variáveis de instância dos 2 objetos

    6) Analise a execução do programa usando a ferramenta de debug da IDE (e de preferência, com o plugin Java Visualizer)

    @see usar planuml em ClinicaVeterinaria.puml para visualizar o diagrama.
*/

public class ClinicaVeterinaria {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Lessi", "Beagle", 'F', 15);
        Cachorro cachorro2 = new Cachorro("K9", "Pastor-Alemao",'M', 9);

        System.out.println("----------- Cachorros ----------");
        System.out.println(cachorro1.toString());
        System.out.println("--------------------------------%n");
        System.out.println(cachorro2.toString());
        
        
    }
    
}

class Cachorro {
    private String nome;
    private String raca;
    private char sexo;
    private int idade;

    Cachorro(String nome, String raca, char sexo, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
               "Raca: " + getRaca() + "\n" +
               "Sexo: " + getSexo() + "\n" +
               "Idade " + getIdade();
    }

}
