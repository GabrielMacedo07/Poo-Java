package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Funcionario mp = new MeioPeriodo("Gabriel", 88, 3000);
		Funcionario ti = new TempoIntegral("Daniela",3000);
		Funcionario ct = new Contratado("Daniel", 35.0, 120);
		
		
		System.out.println("Salario mensal de tempo integral: "+ti.calcularSalario());
		System.out.println("Salario mensal de Meio Periodo: "+mp.calcularSalario());
		System.out.println("Salario mensal de contradado: "+ct.calcularSalario());

	}

}
