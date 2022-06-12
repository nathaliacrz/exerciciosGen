package ProgramacaoOO;

public class ClienteMain {

	public static void main(String[] args) {
		
		Cliente um = new Cliente();
		
		um.nome = "Jubileu";
		um.cpf = "745-932-859-05";
		um.idade = 23;
		
	
		System.out.println("Nome: " + um.nome);
		System.out.println("CPF: " + um.cpf);
		System.out.println("Idade: " + um.idade);
	}
}
