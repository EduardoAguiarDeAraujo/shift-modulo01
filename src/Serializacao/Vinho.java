package Serializacao;

import java.io.Serializable;

public class Vinho implements Serializable {
	
	private static final long serialVersionUID = 7100179587555243994L;
	private String nome;
	private String tipo;
	private String descricao;
	
	public Vinho() {
	}

	public Vinho(String nome, String tipo, String descricao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	
	
	@Override
	public String toString() {
		return "Vinho [nome=" + nome + ", tipo=" + tipo + ", descricao=" + descricao + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
