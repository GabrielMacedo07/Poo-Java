package Polimorfismo;

public class Contratado extends Funcionario{
	private double valorHora;
    private double horasTrabalhadas;
    private String nome;
    
    public Contratado(String nome,double valorHora, double horasTrabalhadas) {
    	this.nome = nome;
    	this.valorHora = valorHora;
    	this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double calcularSalario() {
    	System.out.println("Funcionário: "+nome);
        return valorHora * horasTrabalhadas;
    }
}
