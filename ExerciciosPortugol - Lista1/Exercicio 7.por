programa
{
	
	funcao inicio()
	{
		inteiro A, B, C, D, E, F
		real x, y
	
		escreva("Insira os valores de A, B, C, D, E, e F, respectivamente: " + "\n")
		leia(A)
		leia(B)
		leia(C)
		leia(D)
		leia(E)
		leia(F)

		x = (C - F) / (A - D)                // exclui os valores que 
		y = (A - C) / (B - E)			 //se anulavam na formula
		
		escreva("Valor de x: " + x + "\n")
		escreva("Valor de y: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */