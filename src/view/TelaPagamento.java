package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPagamento;

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
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		telaFundoLabel.add(cpfLabel);
		cpfLabel.setBounds(20, 20, 160, 30);
		
		cpfFormatField=new JFormattedTextField(handlerPagamento.Mascara("###.###.###-##"));
		telaFundoLabel.add(cpfFormatField);
		cpfFormatField.setBounds(120, 20, 110, 30);
		
		valorLabel=new JLabel("Inssira o Valor: ");
		telaFundoLabel.add(valorLabel);
		valorLabel.setBounds(20, 60, 160, 30);
		
		valorField=new JTextField(10);
		telaFundoLabel.add(valorField);
		valorField.setBounds(120, 60, 50, 30);
		
		pagarButton=new JButton("Efetuar Pagamento");
		telaFundoLabel.add(pagarButton);
		pagarButton.setBounds(320, 400, 160, 30);
		
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
