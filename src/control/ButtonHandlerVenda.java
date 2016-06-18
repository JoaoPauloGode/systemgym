package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import dao.CRUD;
import view.TelaVenda;


public class ButtonHandlerVenda implements ActionListener {

	TelaVenda telaVenda;

	public ButtonHandlerVenda(TelaVenda telavenda) {
		this.telaVenda=telavenda;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaVenda.getDebitarButton()) {

			if(telaVenda.getCpfFormatField().getText().equals("")||telaVenda.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					new CRUD().updateVenda(telaVenda.getCpfFormatField().getText().replaceAll("\\D", ""), Double.parseDouble(telaVenda.getValorField().getText()));
					JOptionPane.showMessageDialog(null, "Venda Efetuada");
				} catch (java.lang.IndexOutOfBoundsException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
				}
			}
			telaVenda.getCpfFormatField().setText("");
			telaVenda.getValorField().setText("");
		}
	}
	
	public MaskFormatter Mascara(String Mascara) {
		MaskFormatter F_Mascara = new MaskFormatter();
		try {
			F_Mascara.setMask(Mascara);
			F_Mascara.setPlaceholderCharacter(' ');
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return F_Mascara;
	}
}
