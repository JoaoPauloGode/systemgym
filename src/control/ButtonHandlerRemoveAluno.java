package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CRUD;
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
				new CRUD().delete(Integer.parseInt(telaRemoveAluno.getIdField().getText()));
				JOptionPane.showMessageDialog(null, "Aluno Removido do BD");
				
			} catch (java.lang.IndexOutOfBoundsException e2) {
				
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
			}
			telaRemoveAluno.getIdField().setText("");
		}
	}
}
