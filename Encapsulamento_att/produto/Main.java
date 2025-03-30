package Encapsulamento_att.produto;

public class Main {

	public static void main(String[] args) {
		EstoqueProduto produto = new EstoqueProduto("tomate", 10, 1.2);
			
		
		produto.cadastrar("laranja", 12, 5.50);
		
		produto.removerQuantidade(5);
		
		produto.adicionarQuantidade(10);
		
		produto.exibirEstoque();
		
				

	}

}
