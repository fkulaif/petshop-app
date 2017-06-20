package com.pingosoft.unicep.poo.app.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pingosoft.unicep.poo.app.model.DadosUsuario;
import com.pingosoft.unicep.poo.app.model.Pessoa;

public class Usuario extends Pessoa { // id nome cpf rg
	private String login;
	private String senha;
	private String cargo;

	public Usuario(String nome, String cpf, String rg, String login, String senha, String cargo) {
		super();
		// super.nome = nome; // usuario.setNome(nome);
		// super.cpf = cpf;
		// super.rg = rg;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}

	public static void main(String[] args) {

		Scanner l = new Scanner(System.in);
		System.out.println("CADASTRO DE USUÁRIOS");
		System.out.println("Digite os dados: " + "\nNome: ");
		String nome = l.nextLine();
		System.out.println("Login desejado: ");
		String login = l.nextLine();
		System.out.println("Cargo: ");
		String cargo = l.nextLine();
		System.out.println("Senha de acesso:");
		int senha = l.nextInt();

	}

	// public void nome(String nome) {
	// this.nome = nome;
	// }
	//
	// @Override
	// public String getNome() {
	// return this.nome;
	// }
	//
	// public void setCPF(String cpf) {
	// this.cpf = cpf;
	// }
	//
	// public String getCPF() {
	// return this.cpf;
	// }
	//
	// public void setRG(String rg) {
	// this.rg = rg;
	// }
	//
	// public String getRG() {
	// return this.rg;
	// }

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
	boolean salvarPessoa() {
		DadosUsuario usuario;
		usuario = new DadosUsuario();
		usuario.setNome(this.nome);
		usuario.setLogin(this.login);
		usuario.setCargo(this.cargo);
		ArrayList<DadosUsuario> usuarios = new ArrayList<DadosUsuario>();
		usuarios.add(usuario);
		System.out.println(usuario.getNome() + "\n" + usuario.getLogin() + "\n" + usuario.getCargo());

		return true;
	}

	@Override
	boolean deletarPessoa() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	List<Pessoa> listarPessoa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean editarPessoa() {
		// TODO Auto-generated method stub
		return false;
	}
}