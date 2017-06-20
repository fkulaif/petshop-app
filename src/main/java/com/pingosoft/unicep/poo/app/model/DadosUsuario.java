package com.pingosoft.unicep.poo.app.model;

public class DadosUsuario {
	private String nome;
    private int senha;
    private String login;
	private String cargo;
	
	public DadosUsuario(){
	}
	
	public String getNome(){
	   return nome;
	}
	public void setNome(String name){
	   nome = name;
	}
	public String getLogin(){
	   return login;
	}
	public void setLogin(String log ){
	   login = log;
	}
	public String getCargo(){
	   return cargo;
	}
	public void setCargo(String car){
	   cargo = car;
	}
}