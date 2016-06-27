package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerCadastroAluno;

public class TelaCadastroAluno extends JFrame {
	
	/**
	 * @author JoaoPaulo
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nomeLabel, enderecoLabel, telefoneLabel, cpfLabel, dataLabel; 
	private JTextField nomeField, enderecoField;
	private JFormattedTextField cpfFormatField, telefoneFormatField, dataFormatField;
	private JButton cadastroRealizaAlunoButton;
	
	private ButtonHandlerCadastroAluno handlerAluno;
	private JLabel lblTelaCadastro;
	
	public TelaCadastroAluno() {
		super("Tela de Cadastro de Alunos");
		getContentPane().setBackground(Color.BLACK);
		setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		
		handlerAluno=new ButtonHandlerCadastroAluno(this);
		getContentPane().setLayout(null);
		
		/**
		 *==============================================================================
		 */
		nomeLabel=new JLabel("Nome: ");
		nomeLabel.setForeground(Color.CYAN);
		nomeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		enderecoLabel=new JLabel("Endereço: ");
		enderecoLabel.setForeground(Color.CYAN);
		enderecoLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		telefoneLabel=new JLabel("Telefone: ");
		telefoneLabel.setForeground(Color.CYAN);
		telefoneLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfLabel=new JLabel("CPF: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		dataLabel=new JLabel("Data: ");
		dataLabel.setForeground(Color.CYAN);
		dataLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		getContentPane().add(nomeLabel);
		getContentPane().add(enderecoLabel);
		getContentPane().add(telefoneLabel);
		getContentPane().add(cpfLabel);
		getContentPane().add(dataLabel);
		
		nomeLabel.setBounds(10, 62, 50, 30);
		enderecoLabel.setBounds(227, 62, 76, 30);
		telefoneLabel.setBounds(179, 145, 76, 30);
		cpfLabel.setBounds(10, 145, 50, 30);
		dataLabel.setBounds(369, 145, 50, 30);
		
		//=============================================================================
		nomeField=new JTextField(50);
		nomeField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		cadastroRealizaAlunoButton=new JButton("Cadastrar");
		
		getContentPane().add(nomeField);
		getContentPane().add(cadastroRealizaAlunoButton);
		
		nomeField.setBounds(10, 94, 207, 30);
		cadastroRealizaAlunoButton.setBounds(333, 281, 112, 30);
		enderecoField=new JTextField(100);
		enderecoField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		enderecoField.setBounds(227, 94, 218, 30);
		getContentPane().add(enderecoField);
		telefoneFormatField=new JFormattedTextField(handlerAluno.Mascara("(##)#.####-####"));
		telefoneFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		telefoneFormatField.setBounds(179, 175, 137, 30);
		getContentPane().add(telefoneFormatField);
		dataFormatField=new JFormattedTextField(handlerAluno.Mascara("##/##/####"));
		dataFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		dataFormatField.setBounds(369, 175, 76, 30);
		getContentPane().add(dataFormatField);
		dataFormatField.setToolTipText("Data de matricula do aluno");
		cpfFormatField=new JFormattedTextField(handlerAluno.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfFormatField.setBounds(10, 175, 137, 30);
		getContentPane().add(cpfFormatField);
		
		lblTelaCadastro = new JLabel("Tela Cadastro");
		lblTelaCadastro.setForeground(Color.CYAN);
		lblTelaCadastro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTelaCadastro.setBounds(312, 11, 133, 34);
		getContentPane().add(lblTelaCadastro);
		
		/**
		 *==============================================================================
		 */
		
		cadastroRealizaAlunoButton.addActionListener(handlerAluno);
		setSize(461, 350);
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

	public JFormattedTextField getDataFormatField() {
		return dataFormatField;
	}
}
