package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.Escritora;
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

			try {
				EscreverXML reescrever=new EscreverXML(listaDeAlunos);
				listaDeAlunos.setListaAlunos(reescrever.buscarXML());
				listaDeAlunos.debitar(Double.parseDouble(telaVenda.getValorField().getText()), Integer.parseInt(telaVenda.getIdField().getText()));
				Escritora.escrever(listaDeAlunos);
				reescrever.gerarXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			telaVenda.getIdField().setText("");
			telaVenda.getValorField().setText("");
			JOptionPane.showMessageDialog(null, "Venda Efetuada");
		}
	}
}
