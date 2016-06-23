package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.MaskFormatter;

import dao.CRUDAlunos;
import view.TelaQuitaMensalidade;

public class ButtonHandlerQuitaMensalidade implements ActionListener {

	TelaQuitaMensalidade telaQuitaMensalidade;

	public ButtonHandlerQuitaMensalidade(TelaQuitaMensalidade telaQuitaMensalidade) {
		this.telaQuitaMensalidade = telaQuitaMensalidade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaQuitaMensalidade.getPagarMensalidadeButton()) {
			new CRUDAlunos().updatePagaMensalidade(telaQuitaMensalidade.getCpfFormatField().getText().replaceAll("\\D", ""), 
					telaQuitaMensalidade.getDataFormatField().getText().replaceAll("\\D", ""));
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
