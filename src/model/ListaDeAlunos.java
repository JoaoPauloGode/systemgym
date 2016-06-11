package model;

import java.util.ArrayList;

import view.TelaPesquisaAluno;
import view.TelaVenda;
public class ListaDeAlunos {

	TelaVenda telaVenda;
	TelaPesquisaAluno telaPesquisaAluno;

	public ArrayList<Aluno>listaAlunos=new ArrayList<>();

	public ListaDeAlunos(ArrayList<Aluno> listaAlunos) {
		super();
		this.listaAlunos = listaAlunos;
	}
	
	public ListaDeAlunos() {
		super();
	}

	public void add(Aluno aluno) {
		aluno.setId(listaAlunos.size());
		listaAlunos.add(aluno);
	}

	public void remove(int id) {
		listaAlunos.remove(id);
		int aux=0;
		for(Aluno aluno : listaAlunos) {
			aluno.setId(aux);
			aux+=1;
		}
	}
	
	public void debitar(double debito, int id) {
			listaAlunos.get(id).setSaldoDevedor(listaAlunos.get(id).getSaldoDevedor()+debito);
	}
	
	public void quitar(double valor, int id) {
		listaAlunos.get(id).setSaldoDevedor(listaAlunos.get(id).getSaldoDevedor()-valor);
	}
	
	public ArrayList<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

}
