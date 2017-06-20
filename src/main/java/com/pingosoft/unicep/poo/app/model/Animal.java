package com.pingosoft.unicep.poo.app.model;

import java.util.Scanner;

public class Animal {
	String especie;
	String nome;
	String raca;
	char sexo;
	int idade;
	boolean carrapatos;
	boolean pulgas;
	boolean lesoes;
	String obs;

	void temLesoes(char diagnostico) {

		final Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 'S' or 'N' (maiuscula ou nao");
		final char diagnosticoLesoes = scanner.next().toUpperCase().charAt(0);

		do
			// if(diagnostico == 's' || diagnostico == 'S') {
			if(diagnosticoLesoes == 'S')
				this.lesoes = true;
			// } else if(diagnostico == 'n' || diagnostico == 'N'){
			else
				if(diagnosticoLesoes == 'N')
					this.lesoes = false;
		while (diagnosticoLesoes != 'S' || diagnosticoLesoes != 'N');
	}
} // }while(!(diagnosticoLesoes == 'S' || diagnosticoLesoes == 'N'));
