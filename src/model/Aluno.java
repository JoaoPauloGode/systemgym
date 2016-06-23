package model;

public class Aluno {

	private String nome, endereco, telefone, CPF, data;
	private int id;
	private double saldoDevedor;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String endereco, String telefone, String CPF, double saldoDevedor, String data) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.CPF=CPF;
		this.saldoDevedor=saldoDevedor;
		this.data=data;
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

	public String getCPF() {
		return CPF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
