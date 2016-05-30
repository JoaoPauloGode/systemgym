package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.ListaDeAlunos;
import control.ButtonHandlerCadastroAluno;

public class TelaCadastroAluno extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel telaFundoLabel, nomeLabel, enderecoLabel, telefoneLabel; 
	private JTextField nomeField, enderecoField, telefoneField;
	private JButton cadastroRealizaAlunoButton;
	
	private ButtonHandlerCadastroAluno handlerAluno;
	
	ListaDeAlunos listaAlunos;
	public TelaCadastroAluno(ListaDeAlunos lista) {
		super("Tela de Cadastro de Alunos");
		listaAlunos = lista;
		handlerAluno=new ButtonHandlerCadastroAluno(this,lista);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		/**
		 *==============================================================================
		 */
		nomeLabel=new JLabel("Nome: ");
		enderecoLabel=new JLabel("Endereço: ");
		telefoneLabel=new JLabel("Telefone: ");
		
		telaFundoLabel.add(nomeLabel);
		telaFundoLabel.add(enderecoLabel);
		telaFundoLabel.add(telefoneLabel);
		
		nomeLabel.setBounds(20, 20, 120, 30);
		enderecoLabel.setBounds(20, 60, 120, 30);
		telefoneLabel.setBounds(20, 100, 120, 30);
		//=============================================================================
		nomeField=new JTextField(50);
		enderecoField=new JTextField(100);
		telefoneField=new JTextField(20);
		cadastroRealizaAlunoButton=new JButton("Cadastrar");
		
		telaFundoLabel.add(nomeField);
		telaFundoLabel.add(enderecoField);
		telaFundoLabel.add(telefoneField);
		telaFundoLabel.add(cadastroRealizaAlunoButton);
		
		nomeField.setBounds(80, 20, 120, 30);
		enderecoField.setBounds(80, 60, 120, 30);
		telefoneField.setBounds(80, 100, 120, 30);
		cadastroRealizaAlunoButton.setBounds(360, 400, 120, 30);
		
		/**
		 *==============================================================================
		 */
		
		cadastroRealizaAlunoButton.addActionListener(handlerAluno);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public JButton getCadastroRealizaAlunoButton() {
		return cadastroRealizaAlunoButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public JTextField getTelefoneField() {
		return telefoneField;
	}
}
