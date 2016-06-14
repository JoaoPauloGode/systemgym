package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerVenda;

public class TelaVenda extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel idLabel, valorLabel, telaFundoLabel;
	private JTextField idField, valorField;
	private JButton debitarButton;
	
	ButtonHandlerVenda handlerVenda;
	
	public TelaVenda() {
		super("Tela De Vendas");
		
		handlerVenda=new ButtonHandlerVenda(this);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		idLabel=new JLabel("Inssira o ID: ");
		telaFundoLabel.add(idLabel);
		idLabel.setBounds(20, 20, 160, 30);
		
		idField=new JTextField(5);
		telaFundoLabel.add(idField);
		idField.setBounds(100, 20, 30, 30);
		
		valorLabel=new JLabel("Inssira o Valor: ");
		telaFundoLabel.add(valorLabel);
		valorLabel.setBounds(20, 60, 160, 30);
		
		valorField=new JTextField(10);
		telaFundoLabel.add(valorField);
		valorField.setBounds(120, 60, 50, 30);
		
		debitarButton=new JButton("Efetuar Venda");
		telaFundoLabel.add(debitarButton);
		debitarButton.setBounds(360, 400, 120, 30);
		
		debitarButton.addActionListener(handlerVenda);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public JButton getDebitarButton() {
		return debitarButton;
	}

	public JTextField getIdField() {
		return idField;
	}

	public JTextField getValorField() {
		return valorField;
	}
	
}
