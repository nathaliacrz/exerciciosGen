package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double multa;
		int excesso;
		
		System.out.println("Insira peso total dos tomates: ");
		int pesoTomates = sc.nextInt(); 
		
		if(pesoTomates > 50) {
			excesso = pesoTomates - 50;
			multa = excesso * 4;
			System.out.printf("Houve excesso de %d kg de tomate. Multa pelo excesso: R$%.2f.", excesso,  multa);
		} else if(pesoTomates <= 50) {
			System.out.println("Nao houve excesso. Pagamento extra = R$0.0");
		}
		
		sc.close();
	}
}
