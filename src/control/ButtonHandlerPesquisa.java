package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import dao.EscreverXML;
import dao.Escritora;
import model.ListaDeAlunos;
import view.TelaPesquisaAluno;

public class ButtonHandlerPesquisa implements ActionListener {

	TelaPesquisaAluno telapesquisa;
	ListaDeAlunos lista;

	public ButtonHandlerPesquisa(TelaPesquisaAluno telapesquisa, ListaDeAlunos lista) {
		this.telapesquisa = telapesquisa;
		this.lista = lista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telapesquisa.getPesquisarButton()) {


			try {
				EscreverXML reescrever=new EscreverXML(lista);
				lista.setListaAlunos(reescrever.buscarXML());
				lista.pesquisa(telapesquisa.getNomeField().getText());
				Escritora.escrever(lista);
				reescrever.gerarXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			telapesquisa.getNomeField().setText("");
		}
	}
}
