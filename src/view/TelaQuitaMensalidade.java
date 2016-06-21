package view;

import javax.swing.ImageIcon;
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
	
	private JLabel cpfLabel, dataLabel, telaFundoLabel;
	private JFormattedTextField cpfFormatField, dataFormatField;
	private JButton pagarMensalidadeButton;
	
	ButtonHandlerQuitaMensalidade handlerQuitaMensalidade;
	
	public TelaQuitaMensalidade() {
		super("Tela De Mensalidades");
		
		handlerQuitaMensalidade=new ButtonHandlerQuitaMensalidade(this);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		cpfLabel=new JLabel("Inssira o CPF: ");
		telaFundoLabel.add(cpfLabel);
		cpfLabel.setBounds(20, 20, 160, 30);
		
		cpfFormatField=new JFormattedTextField(handlerQuitaMensalidade.Mascara("###.###.###-##"));
		telaFundoLabel.add(cpfFormatField);
		cpfFormatField.setBounds(120, 20, 110, 30);
		
		dataLabel=new JLabel("Inssira a Data: ");
		telaFundoLabel.add(dataLabel);
		dataLabel.setBounds(20, 60, 160, 30);
		
		dataFormatField=new JFormattedTextField(handlerQuitaMensalidade.Mascara("##/##/####"));
		telaFundoLabel.add(dataFormatField);
		dataFormatField.setBounds(120, 60, 80, 30);
		
		pagarMensalidadeButton=new JButton("Pagar Mensalidade");
		telaFundoLabel.add(pagarMensalidadeButton);
		pagarMensalidadeButton.setBounds(340, 400, 150, 30);
		
		pagarMensalidadeButton.addActionListener(handlerQuitaMensalidade);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public JButton getPagarMensalidadeButton() {
		return pagarMensalidadeButton;
	}
	
}
