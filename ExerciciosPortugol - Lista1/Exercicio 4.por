programa
{	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{

		inteiro a, b, c
		real R, S, D, baseR, baseS
	
		escreva("Digite valor de A: ")
		leia(a)
		escreva("Digite o valor de B: ")
		leia(b)
		escreva("Digite o valor de C: ")
		leia(c)

		baseR = a + b
		R = mat.potencia(baseR , 2)
		baseS = b + c
		S = mat.potencia(baseS, 2)

		D = (R + S) / 2

		escreva(D)
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */