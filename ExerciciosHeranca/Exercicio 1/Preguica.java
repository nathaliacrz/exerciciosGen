package exerciciosHeranca;

import java.util.Scanner;

public class Preguica extends Animais{

	Scanner entrada = new Scanner(System.in);

	int sobeArvore;
	
	public void subirArvore() {
		System.out.println("Qual o nome da preguicinha?");
		setNome(entrada.next());
		System.out.println("Qual a idade?");
		setIdade(entrada.nextInt());
		System.out.println("Qual o som?");
		setSom(entrada.next());	
		System.out.println("A bonita viu uma árvore?\n1- Sim.\n2- Não.");
		sobeArvore = entrada.nextInt();
		if(sobeArvore == 1) {
			System.out.println("Certeza que ta lá pendurada só procurar.");
		} else if(sobeArvore == 2) {
			System.out.println("Ela é preguiçosa mas só não subiu em uma porque não achou mesmo.");
		}
	}

	
	
	
	
}
