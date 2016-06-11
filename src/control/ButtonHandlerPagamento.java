package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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

			if(telaPagamento.getIdField().getText().equals("")||telaPagamento.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					listaDeAlunos.quitar(Double.parseDouble(telaPagamento.getValorField().getText()), Integer.parseInt(telaPagamento.getIdField().getText()));
					JOptionPane.showMessageDialog(null, "Pagamento Efetuado");
				} catch (java.lang.IndexOutOfBoundsException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
				} 
			}
			telaPagamento.getIdField().setText("");
			telaPagamento.getValorField().setText("");
		}
	}
}
