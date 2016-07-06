package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ButtonHandlerPesquisa;
import util.Util;

public class TelaPesquisaAluno extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel nomeLabel;
	private JFormattedTextField cpfFormatField;
	private JButton pesquisarButton;

	private ButtonHandlerPesquisa handlerPesquisa;

	public TelaPesquisaAluno() {
		super("Tela de Pesquisa");
		getContentPane().setBackground(Color.BLACK);
		
		getContentPane().setLayout(null);

		handlerPesquisa=new ButtonHandlerPesquisa(this);

		nomeLabel=new JLabel("Inssira CPF P/ Pesquisa: ");
		nomeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		nomeLabel.setForeground(Color.CYAN);
		getContentPane().add(nomeLabel);
		nomeLabel.setBounds(20, 20, 166, 30);

		cpfFormatField=new JFormattedTextField(Util.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(cpfFormatField);
		cpfFormatField.setBounds(20, 52, 130, 30);

		pesquisarButton=new JButton("Pesquisar");
		pesquisarButton.setBackground(Color.CYAN);
		getContentPane().add(pesquisarButton);
		pesquisarButton.setBounds(264, 281, 120, 30);

		pesquisarButton.addActionListener(handlerPesquisa);

		setSize(400, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public JButton getPesquisarButton() {
		return pesquisarButton;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

}
