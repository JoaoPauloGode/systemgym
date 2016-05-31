package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import view.TelaVenda;
@XStreamAlias("ListaDeAlunos")
public class ListaDeAlunos {

	TelaVenda telaVenda;

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
	
	public void pesquisa(String nome) {
		for(int i=0; i<listaAlunos.size(); i++) {
			if(listaAlunos.contains(listaAlunos.get(i).getNome())) {
				JOptionPane.showMessageDialog(null, "Aluno Cadastrado");
			}else {
				JOptionPane.showMessageDialog(null, "Aluno N�o Encontrado");
			}
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
