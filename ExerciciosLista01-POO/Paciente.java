package ProgramacaoOO;

public class Paciente {

	private String nomePaciente;
	private int idadePaciente;
	private String motivoInternacao;
	
	public Paciente(String nome, int idade, String motivo) {
		setNomePaciente(nome);
		setIdadePaciente(idade);
		setMotivoInternacao(motivo);
	}
	
	public String informacoesPaciente() {
		String informacoes = "Nome: " + getNomePaciente() + "\nIdade: " + getIdadePaciente() + "\nMotivo internação: " + getMotivoInternacao();
		return informacoes;	
		}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdadePaciente() {
		return idadePaciente;
	}

	public void setIdadePaciente(int idadePaciente) {
		this.idadePaciente = idadePaciente;
	}

	public String getMotivoInternacao() {
		return motivoInternacao;
	}

	public void setMotivoInternacao(String motivoInternacao) {
		this.motivoInternacao = motivoInternacao;
	}
	
	
	
}
