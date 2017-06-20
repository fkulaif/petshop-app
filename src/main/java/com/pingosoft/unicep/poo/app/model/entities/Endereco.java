package com.pingosoft.unicep.poo.app.model.entities;

public class Endereco {
	private String logradouro;
	private String cpf;
	private String cidade;
	private String telefone;

	public Endereco(String logradouro, String cpf, String cidade,
			String telefone) {
		this.logradouro = logradouro;
		this.cpf = cpf;
		this.cidade = cidade;
		this.telefone = telefone;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}