package Programa;

public class funcionario {
	
	String nome;
	String departamento;
	double salario;
	String dataAdmissao;
	String rg;
	boolean ativo;
	public funcionario(String nome, String departamento, double salario, String dataAdmissao, String rg,
			boolean ativo) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.rg = rg;
		this.ativo = ativo;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public void bonificar (double bonificar) {
		salario += bonificar;
	}
	public void demitir() {
		ativo = false;
	}
	
	
	}
}
