package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ButtonHandlerRemoveAluno;

public class TelaRemoverAluno extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel;
	private JFormattedTextField cpfFormatField;
	private JButton removerButton;
	
	private ButtonHandlerRemoveAluno handlerAluno;
	
	public TelaRemoverAluno() {
		super("Tela de Remoção");
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		
		getContentPane().setLayout(null);
		
		handlerAluno=new ButtonHandlerRemoveAluno(this);
		
		cpfLabel=new JLabel("Inssira o CPF Para Remoção: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setBackground(Color.BLACK);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfLabel);
		cpfLabel.setBounds(20, 20, 200, 30);
		
		cpfFormatField=new JFormattedTextField(handlerAluno.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfFormatField);
		cpfFormatField.setBounds(20, 61, 120, 30);
		
		removerButton=new JButton("Remover");
		removerButton.setBackground(Color.CYAN);
		removerButton.setForeground(Color.BLACK);
		getContentPane().add(removerButton);
		removerButton.setBounds(267, 281, 120, 30);
		
		removerButton.addActionListener(handlerAluno);
		
		setSize(403, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public JButton getRemoverButton() {
		return removerButton;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

}
