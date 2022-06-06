package PrimeiraLista;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		double R, S, D, baseR, baseS;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextInt();
		
		baseR = a + b;
		R = Math.pow(baseR, 2);
		baseS = b + c;
		S = Math.pow(baseS, 2);
		
		D = (R + S) / 2;
		
		System.out.println(D);
		
		sc.close();
	}
}
