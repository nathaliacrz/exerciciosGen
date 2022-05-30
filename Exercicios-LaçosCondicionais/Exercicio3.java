package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		double um = sc.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		double  dois = sc.nextInt();
		
		System.out.println("Insira o terceiro numero: ");
		double  tres = sc.nextInt();
		
		System.out.println("Insira o quarto numero: ");
		double quatro = sc.nextInt();
		
		double  quadradoUm = Math.pow( um, 2);
		double  quadradoDois = Math.pow( dois, 2);
		double  quadradoTres = Math.pow( tres, 2);
		double  quadradoQuatro = Math.pow( quatro, 2);
		
		if(quadradoTres >= 1000) {
			System.out.printf("O quadrado do numero %.1f e %.1f.", tres, quadradoTres);
		} else if(quadradoTres < 1000) {
			System.out.printf("\nO quadrado do numero %.1f e %.1f.", um, quadradoUm );
			System.out.printf("\nO quadrado do numero %.1f e %.1f.", dois, quadradoDois);
			System.out.printf("\nO quadrado do numero %.1f e %.1f.", tres, quadradoTres);
			System.out.printf("\nO quadrado do numero %.1f e %.1f.", quatro, quadradoQuatro);
		}

		sc.close();
		
	}
}
