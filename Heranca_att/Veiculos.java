package Heranca_att;

//Classe pai Veiculo
public class Veiculos {
 private String marca;
 private String modelo;
 private int ano;

 // Construtor
 public Veiculos(String marca, String modelo, int ano) {
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
 }

 // Métodos comuns
 public void ligar() {
     System.out.println("Veículo ligado.");
 }

 public void desligar() {
     System.out.println("Veículo desligado.");
 }

 public void exibirInformacoes() {
     System.out.println("Marca: " + marca);
     System.out.println("Modelo: " + modelo);
     System.out.println("Ano: " + ano);
 }

 // Getters e Setters (opcional)
 public String getMarca() { return marca; }
 public String getModelo() { return modelo; }
 public int getAno() { return ano; }
}

