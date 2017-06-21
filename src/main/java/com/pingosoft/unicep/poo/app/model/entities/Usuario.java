package com.pingosoft.unicep.poo.app.model.entities;

import java.util.ArrayList;
import java.util.List;

import com.pingosoft.unicep.poo.app.model.Pessoa;

public class Usuario extends Pessoa { // id nome cpf rg
	private String login;
	private String senha;
	private String cargo;
	List<Pessoa> listaUsuario;

	public Usuario(int id, String nome, String cpf, String rg, List<Pessoa> listaPessoa, String login, String senha,
			String cargo) {
		super(id, nome, cpf, rg, listaPessoa);
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.listaUsuario = new ArrayList<>();
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public boolean salvar(Pessoa p) {
		try {
			this.listaUsuario.add(p);
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
			return false;
		}
		System.out.printf("\nUsuário %s adicionado com sucesso.", p.getNome());
		System.out.printf("\nLembrete: login: %s | senha: %s | cargo: %s", ((Usuario) p).getLogin(),
				((Usuario) p).getSenha(), ((Usuario) p).getCargo());
		return true;
	}

	@Override
	public boolean deletar(Pessoa p) {
		try {
			this.listaUsuario.remove(p);
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
			return false;
		}
		System.out.printf("\nUsuário %s removido com sucesso.", p.getNome());
		return true;
	}

	@Override
	public List<Pessoa> listar() {
		return super.listar();
	}

	@Override
	public boolean editar(Pessoa p) {
		return super.editar(p);
	}

}