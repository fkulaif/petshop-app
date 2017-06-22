package com.pingosoft.unicep.poo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pingosoft.unicep.poo.app.cadastros.TelaCadastro;

/**
 * Projeto: "Aplicação Java com POO" para disciplina Programação Orientada a
 * Objetos (POO) Profa. Tatiana de Alencar - Engenharia da Computação Aluno:
 * Fernando do A. Kulaif - RA: 5600144 Gestão em T.I. (Aproveitamento de
 * disciplinas) Coordenador do Curso de Gestão em Tecnologia de Informação. -
 * Prof.Wellington Gouveia
 */

public class MyPetshop {

	public MyPetshop() {
		System.out.println("Seja bem-vindo(a) [Inside MyPetShop app]\n\n");
	}

	public static void main(String[] args) {
		System.out.println("Iniciando a Aplicação...");
		MyPetshop app = new MyPetshop();
		app.greet();

		Scanner infoUsuario = new Scanner(System.in);
		System.out.println("\n## Sign in ##");
		System.out.println("login: ");
		String login = infoUsuario.nextLine();
		System.out.println("\nsenha: ");
		String senha = infoUsuario.nextLine();

		if(login.contains("admin") && senha.contains("admin")) {
			TelaCadastro telaCadastro = new TelaCadastro();
			telaCadastro.cabecalhoSistema();
			telaCadastro.menuCadastro();
			System.out.println("ENTRANDO...");
		} else
			// System.err.println("credenciais de usuario incorretas");
			System.out.println("credenciais de usuario incorretas");
		/**
		 * Sign Up shortcut Usuario usuario = new Usuario(id, nome, cpf, rg,
		 * listaPessoa, login, senha, cargo) telaCadastro.menuUsuario();
		 * 
		 */

	}

	public void greet() {
		List<String> greetings = new ArrayList<>(); // using Generics
		greetings.add("Seja bem-vindo!");
		// greetings.add("-- admin --");

		for(String greeting : greetings)
			System.out.println("Greeting: " + greeting + " -- admin --");
	}

}