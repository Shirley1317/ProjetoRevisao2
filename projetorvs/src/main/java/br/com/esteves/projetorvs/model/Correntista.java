package br.com.esteves.projetorvs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_holder")

public class Correntista {
	@Id
	@Column(name = "ag")
	private int ag;
	
	@Column(name = "conta")
	private int conta;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "saldo")
	private float saldo;

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
