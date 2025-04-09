package Polimorfismo;

public class TempoIntegral extends Funcionario {
		private double salario;
		private String nome;
		public TempoIntegral(String nome, double salario) {
			this.nome = nome;
			this.salario = salario;
		}
		
		
		@Override
		public double calcularSalario() {
			System.out.println("Funcionário: "+nome);
			return salario;
		}
}
