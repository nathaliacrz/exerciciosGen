package vetores;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j, linhas = 3, colunas = 3, soma = 0, somaDiagonal = 0;

		int[][] mat = new int[linhas][colunas];

		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				soma += mat[i][j];

				if (mat[i] == mat[j]) { // as diagonais possuem numeros de i e j iguais;
					somaDiagonal += i * 2;
				}
			}
		}
		System.out.println();
		System.out.println("MATRIZ DIGITADA: ");
		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Soma total: " + soma);
		System.out.println("Soma da diagonal: " + somaDiagonal);
		sc.close();

	}

}
