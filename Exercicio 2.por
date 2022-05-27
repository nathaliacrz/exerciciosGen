programa
{
	
	funcao inicio()
	{
		inteiro dias, meses, anos, diasAnuais, diasF, mesesF

		escreva("Digite quantos dias de vida você tem: ")
		leia(dias)

		meses = dias / 30
		anos = meses / 12
		diasAnuais = meses % dias
		mesesF = diasAnuais / 30
		diasF = diasAnuais % 30

		escreva("Você tem " + diasF + " dias, " + mesesF + "meses e " + anos + " anos de vida.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */