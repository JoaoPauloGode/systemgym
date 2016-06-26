package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import control.ButtonHandlerTrocaSenha;

public class TelaTrocaSenha extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField senhaAtualField;
	private JPasswordField senhaNovaField;
	private JButton alterarButton;
	
	private ButtonHandlerTrocaSenha handlerTrocaSenha;

	public TelaTrocaSenha() {
		super("Tela Troca Senha");
		
		handlerTrocaSenha=new ButtonHandlerTrocaSenha(this);
		
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel lblSenhaAtual = new JLabel("Senha Atual:");
		lblSenhaAtual.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblSenhaAtual.setForeground(Color.CYAN);
		lblSenhaAtual.setBackground(Color.CYAN);
		lblSenhaAtual.setBounds(29, 39, 88, 14);
		getContentPane().add(lblSenhaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova Senha:");
		lblNovaSenha.setForeground(Color.CYAN);
		lblNovaSenha.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNovaSenha.setBackground(Color.CYAN);
		lblNovaSenha.setBounds(29, 73, 88, 14);
		getContentPane().add(lblNovaSenha);
		
		senhaAtualField = new JPasswordField();
		senhaAtualField.setBounds(110, 37, 88, 20);
		getContentPane().add(senhaAtualField);
		
		senhaNovaField = new JPasswordField();
		senhaNovaField.setBounds(110, 71, 88, 20);
		getContentPane().add(senhaNovaField);
		
		alterarButton = new JButton("Alterar");
		alterarButton.setBounds(276, 179, 89, 23);
		getContentPane().add(alterarButton);
		alterarButton.addActionListener(handlerTrocaSenha);
		
		setSize(381, 241);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public JPasswordField getSenhaAtualField() {
		return senhaAtualField;
	}

	public JPasswordField getSenhaNovaField() {
		return senhaNovaField;
	}

	public JButton getAlterarButton() {
		return alterarButton;
	}
}
