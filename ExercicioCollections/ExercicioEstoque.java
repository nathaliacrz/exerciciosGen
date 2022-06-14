package collections2;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioEstoque {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	ArrayList<String> produto = new ArrayList<>();
		
		int escolha; 
	
		do {
			System.out.println("1- Adicionar produto: ");
			System.out.println("2- Remover produto: ");
			System.out.println("3- Atualizar produto: ");
			System.out.println("4- Mostrar todos os produtos: ");
			System.out.println("Selecione uma opção: ");
		
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.println("Quantos produtos deseja adicionar? ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				
				for(int i = 0; i < quantidade; i++) {
					System.out.println("Nome do "+ (i + 1) +"° produto: ");
					produto.add(sc.nextLine());
				}
				
			case 2:
				System.out.println(produto); //travei nao sei o que fazer deus me ajude pfv é um pedido de socorro
				
			}
			
		} while(escolha != 0);
		}	
		
		
	
	
	
	}

