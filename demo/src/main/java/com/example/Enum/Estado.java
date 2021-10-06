package com.example.Enum;

public enum Estado {
	
	ACEITO(1L, "Solicitação Aceita"),
	REGEITADO(2L, "Solicitação Regeitada"),
	ANDAMENTO(3L, "Solicitação em Andamento");
	
	private Long codigo;
	private String descricao;
	
	private Estado(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	

	
}
