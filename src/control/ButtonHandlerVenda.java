package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CRUD;
import view.TelaVenda;


public class ButtonHandlerVenda implements ActionListener {

	TelaVenda telaVenda;

	public ButtonHandlerVenda(TelaVenda telavenda) {
		this.telaVenda=telavenda;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaVenda.getDebitarButton()) {

			if(telaVenda.getIdField().getText().equals("")||telaVenda.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					new CRUD().updateVenda(Integer.parseInt(telaVenda.getIdField().getText()), Double.parseDouble(telaVenda.getValorField().getText()));
					JOptionPane.showMessageDialog(null, "Venda Efetuada");
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
