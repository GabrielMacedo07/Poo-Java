package Encapsulamento_att.Curso;

public class Main {

	public static void main(String[] args) {
		Estudante e = new Estudante("Gabriel", "608762333-70", "administração", 20);
		
	
		e.cadastrar("João", "789456357-10", "enfermagem", 24);
		
		e.exibirCadastro();

	}

}
