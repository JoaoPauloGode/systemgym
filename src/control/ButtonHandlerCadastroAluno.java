package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CRUD;
import model.Aluno;
import view.TelaCadastroAluno;

public class ButtonHandlerCadastroAluno implements ActionListener {

	TelaCadastroAluno telaCadastroAluno;

	Aluno aluno;

	public ButtonHandlerCadastroAluno(TelaCadastroAluno telaCadastroAluno) {
		this.telaCadastroAluno = telaCadastroAluno;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaCadastroAluno.getCadastroRealizaAlunoButton()) {

			if(telaCadastroAluno.getNomeField().getText().equals("")||telaCadastroAluno.getEnderecoField().getText().equals("")
					||telaCadastroAluno.getTelefoneFormatField().getText().equals("(  ) .    -    ")||telaCadastroAluno.getCpfFormatField().getText().equals("   .   .   -  ")) {
				JOptionPane.showMessageDialog(null, "Campo(s) em branco");
			}else {
				new CRUD().create(telaCadastroAluno);	
				JOptionPane.showMessageDialog(null, "Aluno cadastrado no BD");
			}

			telaCadastroAluno.getNomeField().setText("");
			telaCadastroAluno.getTelefoneFormatField().setText("");
			telaCadastroAluno.getEnderecoField().setText("");
			telaCadastroAluno.getCpfFormatField().setText("");
			telaCadastroAluno.getDataFormatField().setText("");
		}
	}
}
