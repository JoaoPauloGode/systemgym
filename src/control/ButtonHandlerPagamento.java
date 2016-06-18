package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import dao.CRUD;
import view.TelaPagamento;


public class ButtonHandlerPagamento implements ActionListener {

	TelaPagamento telaPagamento;

	public ButtonHandlerPagamento(TelaPagamento telaPagamento) {
		this.telaPagamento=telaPagamento;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaPagamento.getPagarButton()) {

			if(telaPagamento.getCpfFormatField().getText().equals("   .   .   -")||telaPagamento.getValorField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {

				try {
					new CRUD().updatePagamento(telaPagamento.getCpfFormatField().getText().replaceAll("\\D", ""), Double.parseDouble(telaPagamento.getValorField().getText()));
					JOptionPane.showMessageDialog(null, "Pagamento Efetuado");
				} catch (java.lang.IndexOutOfBoundsException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
				} 
			}
			telaPagamento.getCpfFormatField().setText("");
			telaPagamento.getValorField().setText("");
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
