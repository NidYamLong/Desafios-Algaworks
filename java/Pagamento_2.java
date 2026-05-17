/**
    @see "Desafio: composicao de objetos e metodos"
    @see https://www.algaworks.com/
    @author: Leonardo Marques Moreira - 17/05/2026

    Mais uma alteração foi solicitada para você.

    Agora, você deve alterar o código do método calcularSalario da classe FolhaPagamento para retornar um novo tipo Holerite.

    A classe Holerite deve ter as seguintes propriedades:

        Funcionário
        Valor total das horas normais
        Valor total das horas extras
        Valor do adicional para filhos

    Além disso, a classe Holerite deve possuir os seguintes comportamentos/métodos:

        Calcular valor total (deve somar todos os valores e chegar no valor total)
        Imprimir (deve imprimir na saída todos os detalhes do holerite)

*/

public class Pagamento_2 {
    public static void main(String[] args) {
        ContratoTrabalho_1 contratoTrabalho = new ContratoTrabalho_1(new Funcionario_1("Jose"), 8.50, 15.0);

        System.out.println(FolhaPagamento_2.calcularSalario(contratoTrabalho, 220, 32));
    }
}

class FolhaPagamento_2 {
    static Holerite calcularSalario(ContratoTrabalho_1 contratoTrabalho, int qtdHorasTrabalhadas, int qtdHorasExtras) {
        Holerite holerite = new Holerite(contratoTrabalho.getFuncionario());
        holerite.setSalarioBase(contratoTrabalho, qtdHorasTrabalhadas);
        holerite.setExtraNoSalario(contratoTrabalho, qtdHorasExtras);

        return holerite;
    }
}

class Funcionario_1 {
    private String nome;
    private int qtdFilhos = 0;

    public Funcionario_1(String nome) {
        setNome(nome);

    }

    public Funcionario_1(String nome, int qtdFilhos) {
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
                "qtd de Filhos: " + getQtdFilhos();
    }
}

class ContratoTrabalho_1 {
    private Funcionario_1 funcionario;
    private double valorHoraNormal;
    private double valorHoraExtra;

    public ContratoTrabalho_1(Funcionario_1 funcionario, double valorHoraNormal, double valorHoraExtra) {
        setFuncionario(funcionario);
        setValorHoraNormal(valorHoraNormal);
        setValorHoraExtra(valorHoraExtra);

    }

    public void setFuncionario(Funcionario_1 funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario_1 getFuncionario() {
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

    @Override
    public String toString() {
        return "Funcionario: {" + getFuncionario() + "}" + "\n" +
            "Valor Hora Normal: " + getValorHoraNormal() + "\n" + 
            "Valor Hora Extra: " + getValorHoraExtra();
    }
}

class Holerite {
    private Funcionario_1 funcionario;
    private double salarioBase;
    private double extraNoSalario;
    private static final double VALOR_ADICIONAL_POR_FILHO = 0.1;

    public Holerite(Funcionario_1 funcionario) {
        setFuncionario(funcionario);
    }

    public void setFuncionario(Funcionario_1 funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario_1 getFuncionario() {
        return this.funcionario;
    }

    public void setSalarioBase(ContratoTrabalho_1 contratoTrabalho, int qtdHorasTrabalhadas) {
        this.salarioBase = qtdHorasTrabalhadas * contratoTrabalho.getValorHoraNormal();
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setExtraNoSalario(ContratoTrabalho_1 contratoTrabalho, int  qtdHorasExtras) {
        this.extraNoSalario = qtdHorasExtras * contratoTrabalho.getValorHoraExtra();
    }

    public double getExtraNoSalario() {
        return this.extraNoSalario;
    }

     private boolean possuiAdicionalPorFilho() {
        return (getFuncionario().getQtdFilhos() >= 1);
    }

    private double adicionalPorFilho() {
        if (possuiAdicionalPorFilho()) {
            return getSalarioBase() * VALOR_ADICIONAL_POR_FILHO;
        }

        return 0;
    }

    private double calcularValorTotal() {
        return getSalarioBase() + getExtraNoSalario() + adicionalPorFilho();
    }

    @Override
    public String toString() {
        return 
        "------------------- Holerite --------------------------\n" +  
        "* Funcionario [" + funcionario +"]\n" +
        "* Salario Base: \t" + getSalarioBase() + "\n" +
        "* Adicional por Filho: \t" + adicionalPorFilho() + "\n" +
        "* Extra No Salario: \t" + getExtraNoSalario() + "\n" +
        "* Valor Total: \t\t" + calcularValorTotal() +
        "\n-------------------------------------------------------\n";  
    }
}