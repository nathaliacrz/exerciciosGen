package ProgramacaoOO;

public class ContaBancaria {

	private String nomeTitular;
	private int numeroAgencia;
	private int NumeroDaConta;
	private int digitoConta;
	
	public ContaBancaria (String nome, int agencia, int conta, int digito) {
		setTitular(nome);
		setAgencia(agencia);
		setConta(conta);
		setDigito(digito);
	}

	String dadosBancarios() {
		String dados = "Nome: " + getTitular() + "\nAgencia: " + getAgencia() + "\nConta: " + getConta() + "\nDigito: " + getDigito();
		return dados;
	}
	
	public String getTitular() {
		return nomeTitular;
	}

	public void setTitular(String titular) {
		this.nomeTitular = titular;
	}

	public int getAgencia() {
		return numeroAgencia;
	}

	public void setAgencia(int agencia) {
		this.numeroAgencia = agencia;
	}

	public int getConta() {
		return NumeroDaConta;
	}

	public void setConta(int conta) {
		this.NumeroDaConta = conta;
	}

	public int getDigito() {
		return digitoConta;
	}

	public void setDigito(int digito) {
		this.digitoConta = digito;
	}
	
}
