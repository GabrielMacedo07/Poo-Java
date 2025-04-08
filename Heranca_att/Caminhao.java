package Heranca_att;

public class Caminhao extends Veiculos {
	 private double capacidadeCarga; // em toneladas

	 public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
	     super(marca, modelo, ano);
	     this.capacidadeCarga = capacidadeCarga;
	 }

	 // Método específico
	 public void carregar() {
	     System.out.println("Caminhão carregado com " + capacidadeCarga + " toneladas.");
	 }

	 @Override
	 public void exibirInformacoes() {
	     super.exibirInformacoes();
	     System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
	 }
	}