package Polimorfismo;

public class MeioPeriodo extends Funcionario {
	private double horasTrabalhadas;
	private double salarioIntegral;
	private String nome;
	
	public MeioPeriodo( String nome,double horasTrabalhadas, double salarioIntegral) {
		this.setNome(nome);
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioIntegral = salarioIntegral;
		
	}
	
	//Aqui temos 220 == a horas trabalhadas tem um tempo integral, em media as horas totais por mês é de 220hrs(44 * 5 semanas)
	@Override
    public double calcularSalario() {
		System.out.println("Funcionário: "+nome);
        return (horasTrabalhadas / 220) * salarioIntegral;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
