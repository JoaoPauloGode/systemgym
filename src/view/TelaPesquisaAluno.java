package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ButtonHandlerPesquisa;

public class TelaPesquisaAluno extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel nomeLabel, telaFundoLabel;;
	private JFormattedTextField cpfFormatField;
	private JButton pesquisarButton;

	private ButtonHandlerPesquisa handlerPesquisa;

	public TelaPesquisaAluno() {
		super("Tela de Pesquisa");

		handlerPesquisa=new ButtonHandlerPesquisa(this);

		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);

		nomeLabel=new JLabel("Inssira CPF P/ Pesquisa: ");
		telaFundoLabel.add(nomeLabel);
		nomeLabel.setBounds(20, 20, 160, 30);

		cpfFormatField=new JFormattedTextField(handlerPesquisa.Mascara("###.###.###-##"));
		telaFundoLabel.add(cpfFormatField);
		cpfFormatField.setBounds(180, 20, 130, 30);

		pesquisarButton=new JButton("Pesquisar");
		telaFundoLabel.add(pesquisarButton);
		pesquisarButton.setBounds(360, 400, 120, 30);

		pesquisarButton.addActionListener(handlerPesquisa);

		setSize(500, 500);
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
