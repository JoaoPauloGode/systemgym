package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.TelaLogin;
import view.TelaTrocaSenha;

public class ButtonHandlerTrocaSenha implements ActionListener {
	
	TelaTrocaSenha telaTrocaSenha;
	ButtonHandlerTelaLogin handlerLogin=new ButtonHandlerTelaLogin(new TelaLogin());

	public ButtonHandlerTrocaSenha(TelaTrocaSenha telaTrocaSenha) {
		this.telaTrocaSenha = telaTrocaSenha;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaTrocaSenha.getAlterarButton()) {
			if(telaTrocaSenha.getSenhaAtualField().getText().equals(handlerLogin.getSenha())) {
				handlerLogin.setSenha(telaTrocaSenha.getSenhaNovaField().getText());
				JOptionPane.showMessageDialog(null, "Senha Atualizada!");
			}else if(telaTrocaSenha.getSenhaAtualField().getText().equals(handlerLogin.getSenha())==false) {
				JOptionPane.showMessageDialog(telaTrocaSenha, "Senha invalida!");
			}
		}
		
	}

}
