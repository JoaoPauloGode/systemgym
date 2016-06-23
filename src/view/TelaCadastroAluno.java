package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerCadastroAluno;
import java.awt.Font;

public class TelaCadastroAluno extends JFrame {
	
	/**
	 * @author JoaoPaulo
	 */
	private static final long serialVersionUID = 1L;
	private JLabel telaFundoLabel, nomeLabel, enderecoLabel, telefoneLabel, cpfLabel, dataLabel; 
	private JTextField nomeField, enderecoField;
	private JFormattedTextField cpfFormatField, telefoneFormatField, dataFormatField;
	private JButton cadastroRealizaAlunoButton;
	
	private ButtonHandlerCadastroAluno handlerAluno;
	
	public TelaCadastroAluno() {
		super("Tela de Cadastro de Alunos");
		
		handlerAluno=new ButtonHandlerCadastroAluno(this);
		getContentPane().setLayout(null);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		telaFundoLabel.setBounds(0, 0, 494, 472);
		getContentPane().add(telaFundoLabel);
		/**
		 *==============================================================================
		 */
		nomeLabel=new JLabel("Nome: ");
		nomeLabel.setFont(new Font("Arial", Font.BOLD, 14));
		enderecoLabel=new JLabel("Endereço: ");
		enderecoLabel.setFont(new Font("Arial", Font.BOLD, 14));
		telefoneLabel=new JLabel("Telefone: ");
		telefoneLabel.setFont(new Font("Arial", Font.BOLD, 14));
		cpfLabel=new JLabel("CPF: ");
		cpfLabel.setFont(new Font("Arial", Font.BOLD, 14));
		dataLabel=new JLabel("Data: ");
		dataLabel.setFont(new Font("Arial", Font.BOLD, 14));
		
		telaFundoLabel.add(nomeLabel);
		telaFundoLabel.add(enderecoLabel);
		telaFundoLabel.add(telefoneLabel);
		telaFundoLabel.add(cpfLabel);
		telaFundoLabel.add(dataLabel);
		
		nomeLabel.setBounds(20, 20, 120, 30);
		enderecoLabel.setBounds(20, 60, 120, 30);
		telefoneLabel.setBounds(20, 100, 120, 30);
		cpfLabel.setBounds(20, 140, 120, 30);
		dataLabel.setBounds(20, 180, 120, 30);
		
		//=============================================================================
		nomeField=new JTextField(50);
		
		cadastroRealizaAlunoButton=new JButton("Cadastrar");
		
		telaFundoLabel.add(nomeField);
		telaFundoLabel.add(cadastroRealizaAlunoButton);
		
		nomeField.setBounds(80, 20, 120, 30);
		cadastroRealizaAlunoButton.setBounds(360, 400, 120, 30);
		enderecoField=new JTextField(100);
		enderecoField.setBounds(97, 60, 120, 30);
		getContentPane().add(enderecoField);
		telefoneFormatField=new JFormattedTextField(handlerAluno.Mascara("(##)#.####-####"));
		telefoneFormatField.setBounds(86, 101, 120, 30);
		getContentPane().add(telefoneFormatField);
		dataFormatField=new JFormattedTextField(handlerAluno.Mascara("##/##/####"));
		dataFormatField.setBounds(62, 180, 80, 30);
		getContentPane().add(dataFormatField);
		dataFormatField.setToolTipText("Data de matricula do aluno");
		cpfFormatField=new JFormattedTextField(handlerAluno.Mascara("###.###.###-##"));
		cpfFormatField.setBounds(62, 142, 120, 30);
		getContentPane().add(cpfFormatField);
		
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

	public JFormattedTextField getDataFormatField() {
		return dataFormatField;
	}

}
