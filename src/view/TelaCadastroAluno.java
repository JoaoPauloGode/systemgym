package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerCadastroAluno;
import model.ListaDeAlunos;

public class TelaCadastroAluno extends JFrame {
	
	/**
	 * @author JoaoPaulo
	 */
	private static final long serialVersionUID = 1L;
	private JLabel telaFundoLabel, nomeLabel, enderecoLabel, telefoneLabel, cpfLabel; 
	private JTextField nomeField, enderecoField;
	private JFormattedTextField cpfFormatField, telefoneFormatField;
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
		cpfLabel=new JLabel("CPF: ");
		
		telaFundoLabel.add(nomeLabel);
		telaFundoLabel.add(enderecoLabel);
		telaFundoLabel.add(telefoneLabel);
		telaFundoLabel.add(cpfLabel);
		
		nomeLabel.setBounds(20, 20, 120, 30);
		enderecoLabel.setBounds(20, 60, 120, 30);
		telefoneLabel.setBounds(20, 100, 120, 30);
		cpfLabel.setBounds(20, 140, 120, 30);
		
		//=============================================================================
		nomeField=new JTextField(50);
		enderecoField=new JTextField(100);
		telefoneFormatField=new JFormattedTextField(handlerAluno.Mascara("(##)#.####-####"));
		cpfFormatField=new JFormattedTextField(handlerAluno.Mascara("###.###.###-##"));
		cadastroRealizaAlunoButton=new JButton("Cadastrar");
		
		telaFundoLabel.add(nomeField);
		telaFundoLabel.add(enderecoField);
		telaFundoLabel.add(telefoneFormatField);
		telaFundoLabel.add(cadastroRealizaAlunoButton);
		telaFundoLabel.add(cpfFormatField);
		
		nomeField.setBounds(80, 20, 120, 30);
		enderecoField.setBounds(80, 60, 120, 30);
		telefoneFormatField.setBounds(80, 100, 120, 30);
		cadastroRealizaAlunoButton.setBounds(360, 400, 120, 30);
		cpfFormatField.setBounds(80, 140, 120, 30);
		
		/**
		 *==============================================================================
		 */
		
		cadastroRealizaAlunoButton.addActionListener(handlerAluno);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
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

	public JFormattedTextField getTelefoneFormatField() {
		return telefoneFormatField;
	}

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

}
