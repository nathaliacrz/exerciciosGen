package novaLista;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.printf("Insira o %dº número: ", i);
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				somaPares++;
			} else {
				somaImpares++;
			}
			
		}
		
		System.out.printf("\nQuantidade de números pares: %d", somaPares);
		System.out.printf("\nQuantidade de números ímpares: %d", somaImpares);
		
		
		
		sc.close();
	}
}
