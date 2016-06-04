package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.EscreverXML;
import dao.Escritora;
import model.ListaDeAlunos;
import view.TelaVenda;


public class ButtonHandlerVenda implements ActionListener {

	TelaVenda telaVenda;
	ListaDeAlunos listaDeAlunos;

	public ButtonHandlerVenda(TelaVenda telavenda, ListaDeAlunos listaDeAlunos) {
		this.telaVenda=telavenda;
		this.listaDeAlunos=listaDeAlunos;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaVenda.getDebitarButton()) {

			if(telaVenda.getIdField().getText().equals("")||telaVenda.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					EscreverXML reescrever=new EscreverXML(listaDeAlunos);
					listaDeAlunos.setListaAlunos(reescrever.buscarXML());
					listaDeAlunos.debitar(Double.parseDouble(telaVenda.getValorField().getText()), Integer.parseInt(telaVenda.getIdField().getText()));
					Escritora.escrever(listaDeAlunos);
					reescrever.gerarXML();
					JOptionPane.showMessageDialog(null, "Venda Efetuada");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.lang.IndexOutOfBoundsException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
				}
			}
			telaVenda.getIdField().setText("");
			telaVenda.getValorField().setText("");
		}
	}
}
