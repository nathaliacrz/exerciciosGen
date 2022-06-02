programa
{ inclua biblioteca Matematica-->mat 
	
	funcao inicio()
	{
		inteiro x1, y1, x2, y2, D, potencia
	
		escreva("Insira ponto x1: ")
		leia(x1)
		escreva("Insira ponto x2: ")
		leia(x2)
		escreva("Insira ponto y1: ")
		leia(y1)
		escreva("Insira ponto y2: ")
		leia(y2)

 		potencia = mat.potencia((x2 - x1), 2) + mat.potencia((y2 - y1), 2)

		D = mat.raiz(potencia, 2)
		
		escreva(D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */