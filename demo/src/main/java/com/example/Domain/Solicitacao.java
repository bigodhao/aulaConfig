package com.example.Domain;

import java.time.LocalDate;

import com.example.Enum.Estado;
import com.example.Enum.TipoSolicitacao;

public class Solicitacao {
	
	private Long id;
	private Estado estado;
	private Usuario solicitante;
	private TipoSolicitacao tipoSolicitacao;
	private LocalDate data;
	private String descricao;
	
	public Solicitacao(Long id, Estado estado, Usuario solicitante, TipoSolicitacao tipoSolicitacao, LocalDate data,
			String descricao) {
		super();
		this.id = id;
		this.estado = estado;
		this.solicitante = solicitante;
		this.tipoSolicitacao = tipoSolicitacao;
		this.data = data;
		this.descricao = descricao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}

	public TipoSolicitacao getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
}
