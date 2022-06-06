package PrimeiraLista;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anos, meses, dias, diasTotais;

		System.out.println("Digite sua idade em:");
		
		System.out.println("Anos: ");
		anos = sc.nextInt();
		
		System.out.println("Meses: ");
		meses = sc.nextInt();
		
		System.out.println("Dias: ");
		dias = sc.nextInt();
		
		diasTotais = anos * 365 + meses * 30 + dias;

		System.out.printf("Você está vivo há %d dias.", diasTotais );
		
		sc.close();
	}
}
