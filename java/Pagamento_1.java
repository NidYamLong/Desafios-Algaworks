/**
    @see "Desafio: composicao de objetos e metodos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 17/05/2026

    O desenvolvedor sênior da empresa que te contratou revisou o seu código e pediu algumas alterações.

    Você deve criar uma classe Funcionario com as seguintes propriedades:

        Nome
        Quantidade de filhos

    E também, deve criar uma classe ContratoTrabalho com as propriedades:

        Funcionário (ou seja, uma variável do tipo Funcionario)
        Valor da hora normal
        Valor da hora extra

    Depois, você deve refatorar o método calcular da classe FolhaPagamento para receber um objeto do tipo ContratoTrabalho como parâmetro, substituindo os parâmetros de valores de hora.

    Além disso, uma nova regra deve ser adicionada neste mesmo método:

    Quando o funcionário possuir 1 ou mais filhos, você deve calcular um adicional de 10% no valor total do salário.

    Crie métodos na classe Funcionario e ContratoTrabalho para que você possa "perguntar" ao objeto se o contrato possui ou não o adicional para filhos, tornando assim essas classes mais ricas.
*/

public class Pagamento_1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jose", 6);
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho(funcionario, 8.50, 15.0);

        System.out.println(FolhaPagamento_1.calcularSalario(contratoTrabalho, 220, 32));
    }
}

class FolhaPagamento_1 {
    static double calcularSalario(ContratoTrabalho contratoTrabalho, int qtdHorasTrabalhadas, int qtdHorasExtras) {
        double salarioBase = qtdHorasTrabalhadas * contratoTrabalho.getValorHoraNormal();
        double extraNoSalario = qtdHorasExtras * contratoTrabalho.getValorHoraExtra();


        return (contratoTrabalho.adicionalPorFilho())? (salarioBase * 1.1)+ extraNoSalario : salarioBase + extraNoSalario;
    }
}

class Funcionario {
    String nome;
    int qtdFilhos = 0;

    public Funcionario(String nome) {
        setNome(nome);

    }

    public Funcionario(String nome, int qtdFilhos) {
        this(nome);
        setQtdFilhos(qtdFilhos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public int getQtdFilhos() {
        return this.qtdFilhos;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", " +
                "qtd de Filhoe: " + getQtdFilhos();
    }
}

class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    public ContratoTrabalho(Funcionario funcionario, double valorHoraNormal, double valorHoraExtra) {
        setFuncionario(funcionario);
        setValorHoraNormal(valorHoraNormal);
        setValorHoraExtra(valorHoraExtra);

    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraNormal() {
        return this.valorHoraNormal;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getValorHoraExtra() {
        return this.valorHoraExtra;
    }

    public boolean adicionalPorFilho() {
        return (funcionario.getQtdFilhos() >= 1);
    }

    @Override
    public String toString() {
        return "Funcionario: {" + getFuncionario() + "}" + "\n" +
            "Valor Hora Normal: " + getValorHoraNormal() + "\n" + 
            "Valor Hora Extra: " + getValorHoraExtra();
    }
}