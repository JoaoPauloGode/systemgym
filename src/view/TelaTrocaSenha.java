package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class TelaTrocaSenha extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton alterarButton;

	public TelaTrocaSenha() {
		super("Tela Troca Senha");
		
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 37, 88, 20);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(110, 71, 88, 20);
		getContentPane().add(passwordField_1);
		
		alterarButton = new JButton("Alterar");
		alterarButton.setBounds(276, 179, 89, 23);
		getContentPane().add(alterarButton);
		
		setSize(381, 241);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
