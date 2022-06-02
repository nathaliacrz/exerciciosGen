programa
{ 
	
	funcao inicio()
	{
		real valor, distribuidor, impostos, valorCliente
	
		escreva("Insira o valor de fabrica do veículo (sem virgulas): ")
		leia(valor)

		distribuidor = valor * 0.28
		impostos = valor * 0.45
		valorCliente = valor + impostos + distribuidor 

		escreva("Valor de compra: " + valorCliente)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */