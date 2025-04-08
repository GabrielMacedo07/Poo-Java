package Heranca_att;

public class Bicicleta extends Veiculos {
private int numeroMarchas;

public Bicicleta(String marca, String modelo, int ano, int numeroMarchas) {
   super(marca, modelo, ano);
   this.numeroMarchas = numeroMarchas;
}

// Método específico
public void pedalar() {
   System.out.println("Bicicleta em movimento!");
}

@Override
public void exibirInformacoes() {
   super.exibirInformacoes();
   System.out.println("Número de marchas: " + numeroMarchas);
}
}