package com.example.Enum;

public enum TipoSolicitacao {
	
	MELHORIA(1L, "Melhoria no sistema"),
	CORRECAO(2L, "Correções no sistema");
	
	private Long codigo;
	private String descricao;
	
	private TipoSolicitacao(Long codigo, String descricao) {
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
