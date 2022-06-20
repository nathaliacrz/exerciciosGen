package ProgramacaoOO;

public class PacienteMain {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Juninho", 19, "Achou que era o bicho piruleta e torceu o pé.");
		
		System.out.println(paciente1.informacoesPaciente());
	}
}
