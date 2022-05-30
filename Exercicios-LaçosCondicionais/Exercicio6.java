package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira sua idade para saber em \nqual categoria voce se encaixa: ");
		int idade = sc.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("InfantiB A.");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Infantil B.");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A.");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B.");
		} else if (idade > 18) {
			System.out.println("Adultos.");
		}
		
		

		sc.close();
	}
}
