package ProgramacaoOO;

public class Funcionario {

	private String nomeFuncionario;
	private int idadeFuncionario;
	private String profissaoAtual;
	private String empresaAtual;
	
	public Funcionario(String nome, int idade, String profissao, String empresa) {
		setNome(nome) ;
		setIdade(idade);
		setProfissao(profissao);
		setEmpresaAtual(empresa);
	}
	
	public String informacoesFuncionario() {
		String informacoesFuncionario = "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTrabalha em: " + getEmpresaAtual() + "\nCargo: " + getProfissao();
		return informacoesFuncionario;
	}
	
	public String getNome() {
		return nomeFuncionario;
	}
	public void setNome(String nome) {
		this.nomeFuncionario = nome;
	}
	public int getIdade() {
		return idadeFuncionario;
	}
	public void setIdade(int idade) {
		this.idadeFuncionario = idade;
	}
	public String getProfissao() {
		return profissaoAtual;
	}
	public void setProfissao(String profissao) {
		this.profissaoAtual = profissao;
	}
	public String getEmpresaAtual() {
		return empresaAtual;
	}
	public void setEmpresaAtual(String empresaAtual) {
		this.empresaAtual = empresaAtual;
	}
	
	
	
}
