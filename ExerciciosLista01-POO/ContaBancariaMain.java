package ProgramacaoOO;

public class ContaBancariaMain {

	public static void main(String[] args) {
		
		ContaBancaria pessoa1 = new ContaBancaria("Josefa", 0744, 98337, 6);

		System.out.println(pessoa1.dadosBancarios());
		
	}
}
