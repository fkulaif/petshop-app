package com.pingosoft.unicep.poo.app.model.entities;

import com.pingosoft.unicep.poo.app.model.Animal;

public class Cachorro extends Animal {
	private String nome;
	private String raca;
	private int idade;
	private Dono dono;

	public Cachorro() {
	}

	public Cachorro(String nome, String raca, int idade, Dono dono) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.dono = dono;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Dono getDono() {
		return this.dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

}