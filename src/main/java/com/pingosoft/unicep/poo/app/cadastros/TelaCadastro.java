package com.pingosoft.unicep.poo.app.cadastros;

import java.util.Scanner;

public class TelaCadastro {

	private Scanner l;
	private boolean execute;
	// private List<DadosUsuario> dados;

	public TelaCadastro() {
		this.l = new Scanner(System.in);
		this.execute = true;
		// this.dados = new ArrayList<DadosUsuario>();
		// System.out.println("BEM VINDO AO CADASTRO DE USUARIOS");
		// while (this.execute) {
		// final String opcao = this.menu();
		// if(opcao.equalsIgnoreCase("n"))
		// this.cadastrar();
		// else
		// if(opcao.equalsIgnoreCase("l"))
		// this.listarCadastros();
		// else
		// if(opcao.equalsIgnoreCase("x"))
		// this.execute = false;
		// else
		// System.out.println("\nOpcao Invalida!! \n");
		// }
	}

	public void cabecalhoSistema() {
		System.out.println("### --- ---------------------------- --- ###");
		System.out.println("### --- BEM VINDO AO SISTEMA PETSHOP --- ###");
		System.out.println("### --- ---------------------------- --- ###\n");
	}

	public String menuCadastro() {
		System.out.println("Selecione a opção:");
		System.out.println("1 - Cadastro de Ordem de Serviço");
		System.out.println("2 - Cadastro de Dono");
		System.out.println("3 - Cadastro de Cachorro");
		System.out.println("4 - Cadastro de Serviço");
		System.out.println("5 - Cadastro de Usuário");
		System.out.println("0 - Sair");
		return this.l.nextLine();
	}

	public String menuOS() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return this.l.nextLine();
	}

	public String menuDono() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return this.l.nextLine();
	}

	public String menuCachorro() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return this.l.nextLine();
	}

	public String menuServico() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return this.l.nextLine();
	}

	public String menuUsuario() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return this.l.nextLine();
	}
}