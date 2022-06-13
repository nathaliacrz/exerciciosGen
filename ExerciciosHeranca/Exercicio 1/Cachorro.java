package exerciciosHeranca;

import java.util.Scanner;

public class Cachorro extends Animais {

	Scanner entrada = new Scanner(System.in);
	
	int corre;
	
	public void correr() {
		System.out.println("Qual o nome do cachorro?");
		setNome(entrada.next());
		System.out.println("Qual a idade?");
		setIdade(entrada.nextInt());
		System.out.println("Qual o som?");
		setSom(entrada.next());		
		System.out.println("Tem uma meia na boca do cachorro?\n1- Sim\n2- Não");
		corre = entrada.nextInt();	
		System.out.println("Nome do meliante: " + getNome());
		System.out.println("Idade do individuo: " + getIdade());
		System.out.println("Som que a boneca faz: " + getSom());
		if(corre == 1) {
		System.out.println("Ele ta correndo.");
	} else if(corre == 2) {
		System.out.println("O doguinho ta planejando qual será o próximo objeto que ele vai pegar e sair\ncorrendo por ai enquanto você vai atrás dele"
				+ " implorando pra que ele pare de correr.");
	}
}
	
}
