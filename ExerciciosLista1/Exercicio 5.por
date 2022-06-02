programa
{
	
	funcao inicio()
	{
		real D, dois, T, tres, C, cinco, mediaFinal
	
		escreva("Digite a nota com peso 2: ")
		leia(dois)
		escreva("Digite a nota com peso 3:")
		leia(tres)
		escreva("Digite a nota com peso 5:")
		leia(cinco)

		D = dois * 2
		T = tres * 3
		C = cinco * 5

		mediaFinal = (D + T + C) / 10
		
		escreva(mediaFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */