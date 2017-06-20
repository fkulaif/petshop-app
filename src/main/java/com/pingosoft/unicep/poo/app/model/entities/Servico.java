package com.pingosoft.unicep.poo.app.model.entities;

public class Servico {
	private int id;
	private Banho banho;
	private Tosa tosa;
	private boolean desembolo;
	private boolean tosaHigienica;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Banho getBanho() {
		return this.banho;
	}

	public void setBanho(Banho banho) {
		this.banho = banho;
	}

	public Tosa getTosa() {
		return this.tosa;
	}

	public void setTosa(Tosa tosa) {
		this.tosa = tosa;
	}

	public boolean isDesembolo() {
		return this.desembolo;
	}

	public void setDesembolo(boolean desembolo) {
		this.desembolo = desembolo;
	}

	public boolean isTosaHigienica() {
		return this.tosaHigienica;
	}

	public void setTosaHigienica(boolean tosaHigienica) {
		this.tosaHigienica = tosaHigienica;
	}

}