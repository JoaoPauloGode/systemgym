package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ListaDeAlunos;
import view.TelaRemoverAluno;

public class ButtonHandlerRemoveAluno implements ActionListener {

	TelaRemoverAluno telaRemoveAluno;
	ListaDeAlunos listaDeAlunos;

	public ButtonHandlerRemoveAluno(TelaRemoverAluno telaRemoveAluno, ListaDeAlunos listaDeAlunos) {
		this.telaRemoveAluno = telaRemoveAluno;
		this.listaDeAlunos=listaDeAlunos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaRemoveAluno.getRemoverButton()) {
			
			try {
				listaDeAlunos.remove((Integer.parseInt(telaRemoveAluno.getIdField().getText())));
				JOptionPane.showMessageDialog(null, "Aluno Removido");
			} catch (java.lang.IndexOutOfBoundsException e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "Estouro!, ID excede o número de alunos");
			}
			telaRemoveAluno.getIdField().setText("");
		}
	}
}
