package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CRUD;
import view.TelaPagamento;


public class ButtonHandlerPagamento implements ActionListener {

	TelaPagamento telaPagamento;

	public ButtonHandlerPagamento(TelaPagamento telaPagamento) {
		this.telaPagamento=telaPagamento;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaPagamento.getPagarButton()) {

			if(telaPagamento.getIdField().getText().equals("")||telaPagamento.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					new CRUD().updatePagamento(Integer.parseInt(telaPagamento.getIdField().getText()), Double.parseDouble(telaPagamento.getValorField().getText()));
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
