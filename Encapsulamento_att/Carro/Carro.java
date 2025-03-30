package Encapsulamento_att.Carro;

public class Carro {
	private String modelo;
	private String marca;
	private String cor;
	
	public Carro(String modelo, String marca, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void exibir() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Cor: "+cor);
	}
}
