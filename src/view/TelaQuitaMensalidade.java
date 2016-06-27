package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ButtonHandlerQuitaMensalidade;

public class TelaQuitaMensalidade extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel, dataLabel;
	private JFormattedTextField cpfFormatField, dataFormatField;
	private JButton pagarMensalidadeButton;
	
	ButtonHandlerQuitaMensalidade handlerQuitaMensalidade;
	
	public TelaQuitaMensalidade() {
		super("Tela Quita Mensalidades");
		getContentPane().setBackground(Color.BLACK);
		
		getContentPane().setLayout(null);
		
		handlerQuitaMensalidade=new ButtonHandlerQuitaMensalidade(this);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfLabel);
		cpfLabel.setBounds(10, 11, 115, 30);
		
		cpfFormatField=new JFormattedTextField(handlerQuitaMensalidade.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfFormatField);
		cpfFormatField.setBounds(10, 39, 110, 30);
		
		dataLabel=new JLabel("Inssira a Data: ");
		dataLabel.setForeground(Color.CYAN);
		dataLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(dataLabel);
		dataLabel.setBounds(10, 86, 110, 30);
		
		dataFormatField=new JFormattedTextField(handlerQuitaMensalidade.Mascara("##/##/####"));
		dataFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(dataFormatField);
		dataFormatField.setBounds(10, 115, 80, 30);
		
		pagarMensalidadeButton=new JButton("Pagar Mensalidade");
		pagarMensalidadeButton.setBackground(Color.CYAN);
		getContentPane().add(pagarMensalidadeButton);
		pagarMensalidadeButton.setBounds(234, 281, 150, 30);
		
		pagarMensalidadeButton.addActionListener(handlerQuitaMensalidade);
		
		setSize(400, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public JButton getPagarMensalidadeButton() {
		return pagarMensalidadeButton;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

	public JFormattedTextField getDataFormatField() {
		return dataFormatField;
	}
	
}
