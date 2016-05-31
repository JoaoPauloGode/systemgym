package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.EscreverXML;
import dao.Escritora;
import model.ListaDeAlunos;
import view.TelaPagamento;


public class ButtonHandlerPagamento implements ActionListener {

	TelaPagamento telaPagamento;
	ListaDeAlunos listaDeAlunos;

	public ButtonHandlerPagamento(TelaPagamento telaPagamento, ListaDeAlunos listaDeAlunos) {
		this.telaPagamento=telaPagamento;
		this.listaDeAlunos=listaDeAlunos;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaPagamento.getPagarButton()) {

			try {
				EscreverXML reescrever=new EscreverXML(listaDeAlunos);
				listaDeAlunos.setListaAlunos(reescrever.buscarXML());
				listaDeAlunos.quitar(Double.parseDouble(telaPagamento.getValorField().getText()), Integer.parseInt(telaPagamento.getIdField().getText()));
				Escritora.escrever(listaDeAlunos);
				reescrever.gerarXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			telaPagamento.getIdField().setText("");
			telaPagamento.getValorField().setText("");
			JOptionPane.showMessageDialog(null, "Pagamento Efetuado");
		}
	}
}
