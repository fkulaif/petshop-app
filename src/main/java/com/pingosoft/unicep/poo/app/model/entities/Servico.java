package com.pingosoft.unicep.poo.app.model.entities;

public class Servico {
	private int id;
	private Banho banho;
	private Tosa tosa;
	private boolean desembolo;
	private boolean tosaHigienica;
	
	public boolean isBanhoSimples() {
		return banhoSimples;
	}
	public void setBanhoSimples(boolean banhoSimples) {
		this.banhoSimples = banhoSimples;
	}
	public boolean isBanhoMedicamentoso() {
		return banhoMedicamentoso;
	}
	public void setBanhoMedicamentoso(boolean banhoMedicamentoso) {
		this.banhoMedicamentoso = banhoMedicamentoso;
	}
	public boolean isDesembolo() {
		return desembolo;
	}
	public void setDesembolo(boolean desembolo) {
		this.desembolo = desembolo;
	}
	public boolean isTosaHigienica() {
		return tosaHigienica;
	}
	public void setTosaHigienica(boolean tosaHigienica) {
		this.tosaHigienica = tosaHigienica;
	}
}