package br.com.esteves.projetorvs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // armazenamento
@Table(name = "fluxo_caixa") // nome da tabela no BD

public class Fluxo {
	
	@Id
	@Column(name = "entrada")
	private double entrada;
	
	@Column(name = "saida")
	private double saida;

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	
}
