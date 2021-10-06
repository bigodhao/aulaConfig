package com.example.Domain;

public class Usuario {
	
	private Long id;
	private String nome;
	private String cpf;
	private String cargo;
	
	public Usuario(String nome, String cpf, String cargo) {
		super();
		this.id = Long.MIN_VALUE;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
