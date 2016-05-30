package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaInicial;

public class RadioButtonHandler implements ActionListener {
	
	TelaInicial telaInicial;

	public RadioButtonHandler(TelaInicial telaInicial) {
		this.telaInicial = telaInicial;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(telaInicial.getAlunoRadioButton().isSelected()) {
			telaInicial.getCadastrarAlunoButton().setVisible(true);
			telaInicial.getRemoverAlunoButton().setVisible(true);
			telaInicial.getListarAlunoButton().setVisible(true);
			telaInicial.getPesquisarAlunoButton().setVisible(true);
			
		}else if(telaInicial.getAlunoRadioButton().isSelected()==false) {
			telaInicial.getCadastrarAlunoButton().setVisible(false);
			telaInicial.getRemoverAlunoButton().setVisible(false);
			telaInicial.getListarAlunoButton().setVisible(false);
			telaInicial.getPesquisarAlunoButton().setVisible(false);
			
		}if(telaInicial.getMensalidadeRadioButton().isSelected()==true) {
			telaInicial.getQuitarMensalidadeButton().setVisible(true);
			telaInicial.getListarMensalidadesButton().setVisible(true);
			
		}else if(telaInicial.getMensalidadeRadioButton().isSelected()==false) {
			telaInicial.getQuitarMensalidadeButton().setVisible(false);
			telaInicial.getListarMensalidadesButton().setVisible(false);
			
		}if(telaInicial.getVendaRadioButton().isSelected()) {
			telaInicial.getRealizarVendaButton().setVisible(true);
			
		}else if(telaInicial.getRealizarVendaButton().isSelected()==false) {
			telaInicial.getRealizarVendaButton().setVisible(false);
		}
		
	}

}
