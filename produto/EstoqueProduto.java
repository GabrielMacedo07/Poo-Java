package produto;

public class EstoqueProduto {
		
	private String descricao;
	private int quantidade;
	private double valor;
	
	public EstoqueProduto(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void cadastrar(String descricao, int quantidade, double valor ) {
		System.out.println("-----------------------");
		System.out.println("Descrição: "+descricao);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Valor: R$ "+valor);
		System.out.println("-----------------------");
		
	}
	
	public void removerQuantidade(int valor) {
		if (valor > 0 ) {
			quantidade -= valor;
			System.out.println("Removido com sucesso\n");
		} else {
			System.out.println("Valor inválido!");
		}
	
	}
	public void adicionarQuantidade(int valor) {
		if (valor > 0 ) {
			quantidade += valor;
			System.out.println("Adicionado com sucesso");
		} else {
			System.out.println("Valor inválido!");
		}
	}
	public void exibirEstoque() {
		System.out.println("-----------------------");
		System.out.println("Descrição: "+descricao);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Valor: R$ "+valor);
		System.out.println("-----------------------");
	}
}
