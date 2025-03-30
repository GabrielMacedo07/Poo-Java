package Encapsulamento_att.Curso;

public class Estudante {
		private String nome;
		private String cpf;
		private String curso;
		private int idade;
		
		// Atributos para armazenar o último cadastro
	    private String ultimoNomeCadastrado;
	    private String ultimoCpfCadastrado;
	    private String ultimoCursoCadastrado;
	    private int ultimaIdadeCadastrada;

		public Estudante(String nome, String cpf, String curso, int idade) {
			this.nome = nome;
			this.cpf = cpf;
			this.curso = curso;
			this.idade = idade;
			
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void cadastrar(String nome, String cpf, String curso, int idade) {
	        System.out.println("Cadastrado com sucesso!");
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + cpf);
	        System.out.println("Curso: " + curso);
	        System.out.println("Idade: " + idade);
	        
	        // Salva os dados do último cadastro
	        this.ultimoNomeCadastrado = nome;
	        this.ultimoCpfCadastrado = cpf;
	        this.ultimoCursoCadastrado = curso;
	        this.ultimaIdadeCadastrada = idade;
	    }
		public void exibirCadastro() {
	        System.out.println("-----------------------");
	        System.out.println("DADOS ATUAIS:");
	        System.out.println("Nome: " + this.nome);
	        System.out.println("CPF: " + this.cpf);
	        System.out.println("Curso: " + this.curso);
	        System.out.println("Idade: " + this.idade);
	        
	        System.out.println("\nÚLTIMO CADASTRO:");
	        if (ultimoNomeCadastrado != null) { 
	        	// Verifica se houve cadastro
	            System.out.println("Nome: " + ultimoNomeCadastrado);
	            System.out.println("CPF: " + ultimoCpfCadastrado);
	            System.out.println("Curso: " + ultimoCursoCadastrado);
	            System.out.println("Idade: " + ultimaIdadeCadastrada);
	        } else {
	            System.out.println("Nenhum cadastro registrado ainda.");
	        }
	        System.out.println("-----------------------");
	    }
}
