package com.example.Domain;

import com.example.Enum.EstadoTicket;

public class Ticket {

	private Long id;
	private Usuario criador;
	private Usuario desenvolvedor;
	private Solicitacao solicitacao;
	private EstadoTicket estado;
	private String descricao;
	
	public Ticket(Long id, Usuario criador, Usuario desenvolvedor, Solicitacao solicitacao, EstadoTicket estado,
			String descricao) {
		super();
		this.id = id;
		this.criador = criador;
		this.desenvolvedor = desenvolvedor;
		this.solicitacao = solicitacao;
		this.estado = estado;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public Usuario getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(Usuario desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public EstadoTicket getEstado() {
		return estado;
	}

	public void setEstado(EstadoTicket estado) {
		this.estado = estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
