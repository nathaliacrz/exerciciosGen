package novaLista;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, media, soma = 0, multiplos = 0;
		
		do {
			System.out.println("Insira um número: ");
			numero = sc.nextInt();
			
			if(numero % 3 == 0) {
				multiplos++;
				soma += numero;
			}
			
		} while(numero != 0);
		
		media = soma / (multiplos - 1);
		
		System.out.println("Média dos múltipos de 3: \n" + media);
		
		sc.close();
		
	}
}
