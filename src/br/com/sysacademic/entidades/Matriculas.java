package br.com.sysacademic.entidades;

public class Matriculas {
	
	private String cod_disciplina;
	private String nome_disc;
	private String cpf_aluno;
	private String nome_aluno;
	private String periodo;
	
	public String getCod_disciplina() {
		return cod_disciplina;
	}
	public void setCod_disciplina(String cod_disciplina) {
		this.cod_disciplina = cod_disciplina;
	}
	public String getNome_disc() {
		return nome_disc;
	}
	public void setNome_disc(String nome_disc) {
		this.nome_disc = nome_disc;
	}
	public String getCpf_aluno() {
		return cpf_aluno;
	}
	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}
	public String getNome_aluno() {
		return nome_aluno;
	}
	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
