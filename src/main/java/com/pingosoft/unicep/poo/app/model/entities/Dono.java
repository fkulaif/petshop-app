package com.pingosoft.unicep.poo.app.model.entities;

import java.util.List;

import com.pingosoft.unicep.poo.app.model.Pessoa;

public class Dono extends Pessoa {
	// private Dono dono;
	private Endereco endereco;
	private Cachorro cachorro;
	// private List<Dono> listaDono;
	// private double cash;

	public Dono(int id, String nome, String cpf, String rg, List<Pessoa> listaPessoa, Endereco endereco,
			Cachorro cachorro) {
		super(id, nome, cpf, rg, listaPessoa);
		this.endereco = endereco;
		this.cachorro = cachorro;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cachorro getCachorro() {
		return this.cachorro;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

	// public void setEndereco(String logradouro, String cpf, String cidade) {
	// this.endereco.setLogradouro(logradouro);
	// this.endereco.setCpf(cpf);
	// this.endereco.setCidade(cidade);
	// }

	// List<Dono> listaDono = new ArrayList<>();

	// CRUD Dono
	// public ArrayList<Cachorro> getCachorros() {
	// return this.cachorros;
	// }
	//
	// public ArrayList<Dono> getDonos() {
	// return this.donos;
	// }
	//
	// public void addCachorro(Cachorro c1) {
	// this.cachorros.add(c1);
	// }
	//
	// public void removeCachorro(Cachorro c1) {
	// this.cachorros.remove(c1);
	// }
	//
	// public void addDono(Dono d1) {
	// this.donos.add(d1);
	// }
	//
	// public void removeDono(Dono d1) {
	// this.donos.remove(d1);
	// }
	//
	// public boolean checkIn(Cachorro c1, Dono d1) {
	// // this.pago = false;//this.checkedIn = false;//this.ordemServico =
	// // false;
	// if(ordemServico) {
	// this.checkIn = true;
	// if(pago)
	// this.pago = true;
	// return checkIn;
	// }
	// return checkIn;
	// }
	//
	// public boolean checkOut(Cachorro c1, Dono d1) {
	// // this.pago = false;//this.checkOut = false;beauty if(this.pago){
	// this.checkOut = true;
	// this.pago = true;
	// return pago;
	// return pago;
	// }

}
