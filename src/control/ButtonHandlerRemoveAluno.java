package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import dao.CRUDAlunos;
import view.TelaRemoverAluno;

public class ButtonHandlerRemoveAluno implements ActionListener {

	TelaRemoverAluno telaRemoveAluno;

	public ButtonHandlerRemoveAluno(TelaRemoverAluno telaRemoveAluno) {
		this.telaRemoveAluno = telaRemoveAluno;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaRemoveAluno.getRemoverButton()) {
			
			try {
				new CRUDAlunos().delete(telaRemoveAluno.getCpfFormatField().getText());
				JOptionPane.showMessageDialog(null, "Aluno Removido do BD");
				
			} catch (java.lang.IndexOutOfBoundsException e2) {
				
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
			}
			telaRemoveAluno.getCpfFormatField().setText("");
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
