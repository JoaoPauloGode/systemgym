package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import view.TelaInicial;
import view.TelaLogin;
import view.TelaTrocaSenha;

public class ButtonHandlerTelaLogin implements MouseListener {

	private String senha="admin";
	TelaLogin telaLogin;

	public ButtonHandlerTelaLogin(TelaLogin telaLogin) {
		this.telaLogin = telaLogin;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==telaLogin.getBtnNewButton()) {
			if(telaLogin.getSenhaPasswordField().getText().equals(senha)) {
				telaLogin.getSenhaPasswordField().setText("");
				new TelaInicial();
			} else {
				telaLogin.getSenhaPasswordField().setText("");
				JOptionPane.showMessageDialog(telaLogin, "Senha Incorreta!");
			}
		}else if(e.getSource()==telaLogin.getTrocaSenhaLabel()) {
			new TelaTrocaSenha();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
