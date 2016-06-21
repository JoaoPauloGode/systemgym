package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.MaskFormatter;

import dao.CRUDAlunos;
import model.Aluno;
import view.TelaDadosAluno;
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
			aluno = new CRUDAlunos().select(telapesquisa.getCpfFormatField().getText().replaceAll("\\D", ""));
			telapesquisa.getCpfFormatField().setText("");
			new TelaDadosAluno(aluno);

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
