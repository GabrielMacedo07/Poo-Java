package Heranca_att;

public class Main {
	 public static void main(String[] args) {
	     Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
	     Bicicleta bike = new Bicicleta("Caloi", "Elite", 2021, 18);
	     Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 15.5);

	     carro.ligar();
	     carro.abrirPorta();
	     carro.exibirInformacoes();

	     System.out.println();

	     bike.pedalar();
	     bike.exibirInformacoes();

	     System.out.println();

	     caminhao.carregar();
	     caminhao.exibirInformacoes();
	 }
	}