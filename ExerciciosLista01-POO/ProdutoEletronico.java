package ProgramacaoOO;

public class ProdutoEletronico {

	String nomeProduto;
	int anoDeLancamento;
	int capacidadeBateria;
	
	public ProdutoEletronico(String nome, int ano, int bateria) {
	    nomeProduto = nome;
		anoDeLancamento = ano;
		capacidadeBateria = bateria;
	}
	
	public String informacoesDoProduto() {	
		String informacoesDoProduto = "Tipo de produto: " + nomeProduto + "\nAno de lanaçamento:  " + anoDeLancamento + "\nCapacidade da bateria: " + capacidadeBateria + "mA.";
		return informacoesDoProduto;
	}
	
	
	
}
