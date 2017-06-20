package com.pingosoft.unicep.poo.app;

import java.util.ArrayList;
import java.util.List;

import com.pingosoft.unicep.poo.app.cadastros.TelaCadastro;

/**
 * Projeto: "Aplicação Java com POO" para disciplina Programação Orientada a
 * Objetos (POO) Profa. Tatiana de Alencar - Engenharia da Computação Aluno:
 * Fernando do Amaral Kulaif - RA: 5600144 Gestão em T.I. (Aproveitamento de
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
		TelaCadastro telaCadastro = new TelaCadastro();
		telaCadastro.cabecalhoSistema();
	}

	public void greet() {
		List<String> greetings = new ArrayList<>(); // using Generics
		greetings.add("Seja bem-vindo!");
		// greetings.add("-- admin --");

		for(String greeting : greetings)
			System.out.println("Greeting: " + greeting + " -- admin --");
	}

}
