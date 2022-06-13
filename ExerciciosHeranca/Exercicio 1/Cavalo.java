package exerciciosHeranca;

import java.util.Scanner;

public class Cavalo extends Cachorro{

	Scanner entrada = new Scanner(System.in);
	
	public void correr() {
		System.out.println("Qual o nome do cavalo?");
		setNome(entrada.next());
		System.out.println("Qual a idade?");
		setIdade(entrada.nextInt());
		System.out.println("Qual o som?");
		setSom(entrada.next());		
		System.out.println("\nVocê deu o comando para o cavalo correr?\n1- Sim\n2- Não");
		corre = entrada.nextInt();
		System.out.println("Nome do meliante: " + getNome());
		System.out.println("Idade do individuo: " + getIdade());
		System.out.println("Som que a boneca faz: " + getSom());
		if(corre == 1) {
		System.out.println("Se ele gostar de você e/ou quiser correr ele vai estar correndo.");
	} else if(corre == 2) {
		System.out.println("Ele provavelmente está comendo o matinho dele.");
	}
}
}