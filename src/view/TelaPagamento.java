package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPagamento;
import java.awt.Font;

public class TelaPagamento extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel, valorLabel, telaFundoLabel;
	private JTextField valorField;
	private JFormattedTextField cpfFormatField;
	private JButton pagarButton;
	
	ButtonHandlerPagamento handlerPagamento;
	
	public TelaPagamento() {
		super("Tela De Pagamento");
		
		handlerPagamento=new ButtonHandlerPagamento(this);
		getContentPane().setLayout(null);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		telaFundoLabel.setBounds(0, 0, 494, 472);
		telaFundoLabel.setFont(new Font("Arial", Font.BOLD, 14));
		getContentPane().add(telaFundoLabel);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		cpfLabel.setFont(new Font("Arial", Font.BOLD, 14));
		telaFundoLabel.add(cpfLabel);
		cpfLabel.setBounds(20, 20, 160, 30);
		
		cpfFormatField=new JFormattedTextField(handlerPagamento.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD, 14));
		telaFundoLabel.add(cpfFormatField);
		cpfFormatField.setBounds(120, 20, 110, 30);
		
		valorLabel=new JLabel("Inssira o Valor: ");
		valorLabel.setFont(new Font("Arial", Font.BOLD, 14));
		telaFundoLabel.add(valorLabel);
		valorLabel.setBounds(20, 60, 160, 30);
		
		pagarButton=new JButton("Efetuar Pagamento");
		telaFundoLabel.add(pagarButton);
		pagarButton.setBounds(320, 400, 160, 30);
		
		valorField=new JTextField(10);
		valorField.setBounds(129, 59, 50, 30);
		getContentPane().add(valorField);
		
		JLabel lblTelaDePagamentos = new JLabel("Tela de Pagamentos");
		lblTelaDePagamentos.setBounds(292, 46, 46, 14);
		lblTelaDePagamentos.setFont(new Font("Arial", Font.BOLD, 35));
		getContentPane().add(lblTelaDePagamentos);
		
		JLabel lblTelaPagamento = new JLabel("Tela Pagamento");
		lblTelaPagamento.setBounds(274, 169, 46, 14);
		getContentPane().add(lblTelaPagamento);
		
		pagarButton.addActionListener(handlerPagamento);		
		setSize(500, 500);
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
