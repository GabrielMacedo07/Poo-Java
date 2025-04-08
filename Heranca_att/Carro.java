package Heranca_att;

public class Carro extends Veiculos {
	 private int numeroPortas;

	 public Carro(String marca, String modelo, int ano, int numeroPortas) {
	     super(marca, modelo, ano);
	     this.numeroPortas = numeroPortas;
	 }

	 // Método específico
	 public void abrirPorta() {
	     System.out.println("Porta do carro aberta.");
	 }

	 @Override
	 public void exibirInformacoes() {
	     super.exibirInformacoes();
	     System.out.println("Número de portas: " + numeroPortas);
	 }
	}
