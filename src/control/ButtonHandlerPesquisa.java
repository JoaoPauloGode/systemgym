package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CRUD;
import model.Aluno;
import view.TelaPesquisaAluno;

public class ButtonHandlerPesquisa implements ActionListener {
	Aluno aluno;
	TelaPesquisaAluno telapesquisa;

	public ButtonHandlerPesquisa(TelaPesquisaAluno telapesquisa) {
		this.telapesquisa = telapesquisa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telapesquisa.getPesquisarButton()) {
			aluno = new CRUD().select(telapesquisa.getCpfFormatField().getText().replaceAll("\\D", ""));
			telapesquisa.getCpfFormatField().setText("");

		}
	}


}
