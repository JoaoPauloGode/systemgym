package view;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerVenda;
import util.Util;

import java.awt.Font;
import java.awt.Color;

public class TelaVenda extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel, valorLabel;
	private JTextField valorField;
	private JFormattedTextField cpfFormatField;
	private JButton debitarButton;
	
	ButtonHandlerVenda handlerVenda;
	
	public TelaVenda() {
		super("Tela De Vendas");
		getContentPane().setBackground(Color.BLACK);
		
		handlerVenda=new ButtonHandlerVenda(this);
		getContentPane().setLayout(null);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfLabel.setBounds(20, 20, 160, 30);
		getContentPane().add(cpfLabel);
		
		cpfFormatField=new JFormattedTextField(Util.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfFormatField.setBounds(20, 49, 110, 30);
		getContentPane().add(cpfFormatField);
		
		valorLabel=new JLabel("Inssira o Valor: ");
		valorLabel.setForeground(Color.CYAN);
		valorLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		valorLabel.setBounds(20, 90, 110, 30);
		getContentPane().add(valorLabel);
		
		valorField=new JTextField(10);
		valorField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		valorField.setBounds(20, 119, 50, 30);
		getContentPane().add(valorField);
		
		debitarButton=new JButton("Efetuar Venda");
		debitarButton.setBackground(Color.CYAN);
		debitarButton.setBounds(264, 281, 120, 30);
		getContentPane().add(debitarButton);
		
		JLabel lblTelaVenda = new JLabel("Tela Venda");
		lblTelaVenda.setForeground(Color.CYAN);
		lblTelaVenda.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTelaVenda.setBounds(274, 11, 110, 30);
		getContentPane().add(lblTelaVenda);
		
		debitarButton.addActionListener(handlerVenda);
		
		setSize(400, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public JButton getDebitarButton() {
		return debitarButton;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

	public JTextField getValorField() {
		return valorField;
	}
}
