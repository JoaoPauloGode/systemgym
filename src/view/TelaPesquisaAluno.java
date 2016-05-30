package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPesquisa;
import model.ListaDeAlunos;

public class TelaPesquisaAluno extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel nomeLabel, telaFundoLabel;;
	private JTextField nomeField;
	private JButton pesquisarButton;
	
	private ButtonHandlerPesquisa handlerPesquisa;
	ListaDeAlunos listaAlunos;
	
	public TelaPesquisaAluno() {
		super("Tela de Pesquisa");
		
		handlerPesquisa=new ButtonHandlerPesquisa(this, listaAlunos);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		nomeLabel=new JLabel("Inssira Nome p/ Pesquisa: ");
		telaFundoLabel.add(nomeLabel);
		nomeLabel.setBounds(20, 20, 160, 30);
		
		nomeField=new JTextField(5);
		telaFundoLabel.add(nomeField);
		nomeField.setBounds(180, 20, 130, 30);
		
		pesquisarButton=new JButton("Pesquisar");
		telaFundoLabel.add(pesquisarButton);
		pesquisarButton.setBounds(360, 400, 120, 30);
		
		pesquisarButton.addActionListener(handlerPesquisa);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JButton getPesquisarButton() {
		return pesquisarButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

}
