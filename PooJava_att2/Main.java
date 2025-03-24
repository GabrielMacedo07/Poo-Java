package PooJava_att2;

import java.util.Scanner;

public class Main {

    // Método main para entrada do usuário
    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salário Bruto: ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Imposto: ");
            double imposto = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

            System.out.printf("\nFuncionário: %s, R$ %.2f\n", funcionario.getNome(), funcionario.SalarioLiquido());

            System.out.print("\nDigite a porcentagem para aumentar o salário: ");
            double porcentagem = scanner.nextDouble();
            funcionario.aumentarSalario(porcentagem);

            System.out.printf("\nDados atualizados: %s, R$ %.2f\n",funcionario.getNome(),funcionario.SalarioLiquido());

            
        }
    }

    @Override
    public String toString() {
        return "Main []";
        
    }
}
