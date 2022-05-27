programa
{
	
	funcao inicio()
	{
		inteiro duracao, resto, dias, meses, anos
		
		escreva("Digite quantos dias de vida você tem: ")
		leia(duracao)
		
		anos = duracao / 365
		resto = duracao % 365

		meses = resto / 30
		dias = resto % 30

		escreva("Você tem " + dias + " dias, " + meses + "meses e " + anos + " anos de vida.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */