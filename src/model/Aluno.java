package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Alunos")
public class Aluno {

	private String nome, endereco, telefone;
	private int id;
	private double saldoDevedor;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String endereco, String telefone, double saldoDevedor) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.saldoDevedor=saldoDevedor;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

}
