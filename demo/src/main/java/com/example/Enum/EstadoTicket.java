package com.example.Enum;

public enum EstadoTicket {

	ESCRITA(1L, "Para escrita"),
	DESENVOLVIMENTO(2L, "Em Desenvolvimento"),
	REVIEW(3L, "Em code Review"),
	TESTE(4L, "Em Teste"),
	CONCLUIDO(5L, "Concluido");
	
	private Long codigo;
	private String descricao;
	
	
	private EstadoTicket(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
