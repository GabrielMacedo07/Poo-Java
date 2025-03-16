package pooJava;

import java.util.Locale;
import java.util.Scanner;

public class calculo_do_imc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		float peso = sc.nextFloat();
		System.out.println("Diga sua altura: ");
		float altura = sc.nextFloat();
		
		//calcúlo do IMC
		double imc = peso / (Math.pow(altura, 2));
		
		//Clasificação do imc do usuário 
		String classificacao;
		if (imc < 18.5) {
			classificacao = "Abaixo do peso";
		
		} else if (imc < 24.9) {
			classificacao = "peso normal";
			
		} else if (imc < 29.9) {
			classificacao = "sobrepeso";
			
		} else if (imc < 34.9) {
			classificacao = "grau de obesidade I";
			
		} else if (imc < 39.9) {
			classificacao = "grau de obesidade II";
		} else {
            classificacao = "Obesidade Grau 3 (mórbida)";
        }
		System.out.printf("Seu IMC é: %.2f%n", imc);
		//%.2 ==Formatação 2 casa decimal 
        System.out.println("Classificação: " + classificacao);
	
        sc.close();
		}

}
