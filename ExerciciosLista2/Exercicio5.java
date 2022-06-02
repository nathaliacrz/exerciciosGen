package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nivel de poluicao: ");
		double poluicao = sc.nextDouble();
		
		if(poluicao > 0.05 && poluicao <= 0.25) {
			System.out.println("Todas as industrias estao liberadas.");
		} else if(poluicao >= 0.3 && poluicao < 0.39) {
			System.out.println("Industrias do grupo 1 estao suspensas.");
		} else if(poluicao >= 0.4 && poluicao < 0.49) {
			System.out.println("Industrias dos grupos 1 e 2 estao suspensas.");			
		} else if(poluicao >= 0.5) {
			System.out.println("Todas as industrias estão suspensas.");				
		} else {
			System.out.println("Valor invalido.");
		}
		

		sc.close();
	}
}
