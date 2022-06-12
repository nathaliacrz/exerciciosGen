package ProgramacaoOO;

public class Aviao {

	int anoFabricacao;
	int combustivelCompleto;
	int revisoesEmDia;
	
	public void podeDecolar() {
		if(combustivelCompleto == 1 && revisoesEmDia == 1) {
			System.out.println("O avião está apto para decolar.");
		} else if(combustivelCompleto == 2 && revisoesEmDia == 1) {
			System.out.println("O avião precisa ser abastecido para seguir viagem.");
		} else if(combustivelCompleto == 1 && revisoesEmDia == 2) {
			System.out.println("O avião não está regulamentado, por favor faça a revisão antes de seguir viagem.");
		} else if(combustivelCompleto == 2 && revisoesEmDia == 2) {
			System.out.println("O avião precisa ser abastecido e revisado antes de realizar viagem.");
		}
	}
}
