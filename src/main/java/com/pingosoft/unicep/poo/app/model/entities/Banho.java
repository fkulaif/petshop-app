package com.pingosoft.unicep.poo.app.model.entities;

public class Banho {

	private boolean banhoSimples;
	private boolean banhoMedicamentoso;
	private String obs;
	private Double preco;

	public boolean isBanhoSimples() {
		return this.banhoSimples;
	}

	public void setBanhoSimples(boolean banhoSimples) {
		this.banhoSimples = banhoSimples;
	}

	public boolean isBanhoMedicamentoso() {
		return this.banhoMedicamentoso;
	}

	public void setBanhoMedicamentoso(boolean banhoMedicamentoso) {
		this.banhoMedicamentoso = banhoMedicamentoso;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
