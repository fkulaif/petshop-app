package com.pingosoft.unicep.poo.app.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private List<Pessoa> listaPessoa;

	public Pessoa(int id, String nome, String cpf, String rg, List<Pessoa> listaPessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		// this.listaPessoa = listaPessoa;
		this.listaPessoa = new ArrayList<>();
	}

	public boolean salvarPessoa(Pessoa p) {
		try {
			this.listaPessoa.add(p);
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
			return false;
		}
		return true;
	}

	public boolean deletar(Pessoa p) {
		try {
			this.listaPessoa.remove(p);
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
			return false;
		}
		return true;
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

	@Override
	public String toString() {
		return "Pessoa [id=" + this.id + ", nome=" + this.nome + ", cpf=" + this.cpf + ", rg=" + this.rg
				+ ", listaPessoa=" + this.listaPessoa + "]";
	}

}
