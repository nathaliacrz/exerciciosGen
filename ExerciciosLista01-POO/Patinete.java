package ProgramacaoOO;

public class Patinete {

	String corPatinete;
	int anoFabricacao;
	String publicoAlvo;
	
	public Patinete(String cor, int ano,String publico) {
		corPatinete = cor;
		anoFabricacao = ano;
		publicoAlvo = publico;		
	}
	
	public String descricaoPatinete() {
		String descricao = "Patinete: " + "\nUso: " + publicoAlvo + "\nAno de fabricação: " + anoFabricacao + "\nCor: " + corPatinete;
		return descricao;
	}
}
