package pooJava;

import java.util.Scanner;

public class calculo_de_media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Programa que pega três notas, calcula a média aritmética e diz se o aluno foi aprovado ou não.
		System.out.println("Diga a primeira nota do aluno: ");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Diga a segunda nota: ");
		float nota2 = scanner.nextFloat();
		
		System.out.println("Diga a terceira nota: ");
		float nota3 = scanner.nextFloat();
		
		float resultado = (nota1 + nota2 + nota3)/3;

		System.out.println("A média final do aluno foi: " + resultado);
		
		if (resultado >= 7) {
			System.out.println("Aluno foi aprovado!!!");
		} else {
			System.out.println("Aluno foi reprovado!!!");
		}
		scanner.close();
	}

}
