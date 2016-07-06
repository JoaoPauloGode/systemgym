package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CRUD;
import view.TelaQuitaMensalidade;

public class ButtonHandlerQuitaMensalidade implements ActionListener {

	TelaQuitaMensalidade telaQuitaMensalidade;

	public ButtonHandlerQuitaMensalidade(TelaQuitaMensalidade telaQuitaMensalidade) {
		this.telaQuitaMensalidade = telaQuitaMensalidade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaQuitaMensalidade.getPagarMensalidadeButton()) {
			new CRUD().updatePagaMensalidade(telaQuitaMensalidade.getCpfFormatField().getText().replaceAll("\\D", ""), 
					telaQuitaMensalidade.getDataFormatField().getText().replaceAll("\\D", ""));
		}
	}


}
