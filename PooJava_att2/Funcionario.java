package PooJava_att2;

public class Funcionario {
    private String nome;
    private double salariobruto;
    private double imposto;
    
    
    
    // Construtor
    public Funcionario(String nome, double salariobruto, double imposto) {
        this.nome = nome;
        this.salariobruto = salariobruto;
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido
    public double SalarioLiquido() {
        return salariobruto - imposto;
    }

    // Método para aplicar aumento
    public void aumentarSalario(double porcentagem) {
        salariobruto += salariobruto * (porcentagem / 100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salariobruto;
    }

    public void setSalarioBruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}