package com.pingosoft.unicep.poo.app.model;

import java.util.List;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private List<Pessoa> listaPessoa;

	public boolean criar(Pessoa p) {
		return false;
	}

	public boolean deletar(Pessoa p) {
		return false;
	}

	public List<Pessoa> listar() {
		return this.listaPessoa;
	}

	public boolean editar(Pessoa p) {
		return false;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
