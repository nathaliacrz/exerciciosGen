package ProgramacaoOO;

import java.util.Scanner;

public class AviaoMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aviao um = new Aviao();
		
		System.out.println("Ano de fabricação: ");
		um.anoFabricacao = entrada.nextInt();
		
		System.out.println("Nivel de combustivel:\n1- Cheio.\n2- Precisa completar.");
		um.combustivelCompleto = entrada.nextInt();
		
		System.out.println("Estã com a revisão em dia?\n1- Sim.\n2- Não.");
		um.revisoesEmDia = entrada.nextInt();
		
		um.podeDecolar();
		
		entrada.close();
	}
}
