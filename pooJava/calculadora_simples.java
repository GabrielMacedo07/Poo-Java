package pooJava;

import java.util.Scanner;

public class calculadora_simples {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Operador: ");
		char operador = sc.next().charAt(0);
		
		System.out.println("Informe outro número: ");
		double n2 = sc.nextDouble();
		
		double resultado;
		switch (operador) {
			case '+':
				resultado = n1 + n2;
				break;
			case '-':
				resultado = n1 - n2;
				break;
			case '*':
				resultado = n1 * n2;
				break;
			case '/':
				if (n2 != 0) {
				resultado = n1 / n2;
				
				}else {
					System.out.println("Divisão por zero não é permitido.");
					return;
				}
				break;
				default:
					System.out.println("Operador invalído.");
					return;
				
		}
		System.out.println("Resultado: " + resultado);
	    sc.close();
		
		
		
	}
}
