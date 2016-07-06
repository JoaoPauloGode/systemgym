package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import control.ButtonHandlerTelaLogin;

public class TelaLogin extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	private JTextField loginField;
	private JPasswordField senhaPasswordField;
	private JButton btnNewButton;
	private JLabel trocaSenhaLabel;
	
	private ButtonHandlerTelaLogin handlerLogin;

	public TelaLogin() {
		super("Tela de Login");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("res\\icon.png"));
		
		handlerLogin=new ButtonHandlerTelaLogin(this);
		
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
		
		setSize(381, 241);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 14));
		lblLogin.setBackground(Color.BLACK);
		lblLogin.setBounds(45, 39, 61, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.CYAN);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 14));
		lblSenha.setBounds(45, 85, 61, 14);
		getContentPane().add(lblSenha);
		
		trocaSenhaLabel = new JLabel("<html><u>Alterar Senha</u></html>");
		trocaSenhaLabel.setBounds(279, 11, 86, 20);
		trocaSenhaLabel.setForeground(Color.CYAN);
		getContentPane().add(trocaSenhaLabel);
		trocaSenhaLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		trocaSenhaLabel.addMouseListener(handlerLogin);
		
		loginField = new JTextField();
		loginField.setForeground(Color.BLACK);
		loginField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		loginField.setBounds(95, 36, 86, 20);
		getContentPane().add(loginField);
		loginField.setColumns(10);
		loginField.setText("admin");
		loginField.setEditable(false);
		
		btnNewButton = new JButton("Logar");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(243, 132, 89, 23);
		getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(handlerLogin);
		
		senhaPasswordField = new JPasswordField();
		senhaPasswordField.setForeground(Color.BLACK);
		senhaPasswordField.setBounds(95, 83, 86, 20);
		getContentPane().add(senhaPasswordField);
		
		JLabel lblDesenvolvedorJooPaulo = new JLabel("Desenvolvedor: Joao Paulo Gode Liberal");
		lblDesenvolvedorJooPaulo.setForeground(Color.CYAN);
		lblDesenvolvedorJooPaulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblDesenvolvedorJooPaulo.setBounds(110, 166, 237, 14);
		getContentPane().add(lblDesenvolvedorJooPaulo);
		
		JLabel lblWhatsapp = new JLabel("WhatsApp: (87)9.8861-4258");
		lblWhatsapp.setForeground(Color.CYAN);
		lblWhatsapp.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblWhatsapp.setBounds(110, 188, 237, 14);
		getContentPane().add(lblWhatsapp);
		setVisible(true);
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JPasswordField getSenhaPasswordField() {
		return senhaPasswordField;
	}

	public JLabel getTrocaSenhaLabel() {
		return trocaSenhaLabel;
	}
}
