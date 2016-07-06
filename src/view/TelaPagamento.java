package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPagamento;
import util.Util;

public class TelaPagamento extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel, valorLabel;
	private JTextField valorField;
	private JFormattedTextField cpfFormatField;
	private JButton pagarButton;
	
	ButtonHandlerPagamento handlerPagamento;
	
	public TelaPagamento() {
		super("Tela De Pagamento");
		getContentPane().setBackground(Color.BLACK);
		
		handlerPagamento=new ButtonHandlerPagamento(this);
		getContentPane().setLayout(null);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfLabel);
		cpfLabel.setBounds(20, 20, 102, 30);
		
		cpfFormatField=new JFormattedTextField(Util.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD, 14));
		getContentPane().add(cpfFormatField);
		cpfFormatField.setBounds(20, 47, 110, 30);
		
		valorLabel=new JLabel("Inssira o Valor: ");
		valorLabel.setForeground(Color.CYAN);
		valorLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(valorLabel);
		valorLabel.setBounds(20, 88, 115, 30);
		
		pagarButton=new JButton("Efetuar Pagamento");
		pagarButton.setBackground(Color.CYAN);
		getContentPane().add(pagarButton);
		pagarButton.setBounds(224, 281, 160, 30);
		
		valorField=new JTextField(10);
		valorField.setBounds(20, 115, 50, 30);
		getContentPane().add(valorField);
		
		JLabel lblTelaDePagamentos = new JLabel("Tela de Pagamentos");
		lblTelaDePagamentos.setBounds(292, 46, 46, 14);
		lblTelaDePagamentos.setFont(new Font("Arial", Font.BOLD, 35));
		getContentPane().add(lblTelaDePagamentos);
		
		JLabel lblTelaPagamento = new JLabel("Tela Pagamento");
		lblTelaPagamento.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTelaPagamento.setForeground(Color.CYAN);
		lblTelaPagamento.setBounds(224, 11, 160, 30);
		getContentPane().add(lblTelaPagamento);
		
		pagarButton.addActionListener(handlerPagamento);		
		setSize(400, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public JButton getPagarButton() {
		return pagarButton;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

	public JTextField getValorField() {
		return valorField;
	}
}
