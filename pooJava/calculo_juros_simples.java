package pooJava;

import java.util.Locale;
import java.util.Scanner;

public class calculo_juros_simples {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor emprestado: ");
		double valor_emprestado = scanner.nextDouble();
		
		System.out.println("Diga a taxa do juros: ");
		double taxa = scanner.nextDouble();
		
		System.out.println("Agora em quantos meses: ");
		float meses = scanner.nextFloat();
		
		double resultado = (valor_emprestado * taxa * meses)/100;
		
		System.out.printf("Você pagará R$%.2f de juros\n", resultado);
		scanner.close();
	}
}
