package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPesquisa;
import dao.CRUD;
import model.Aluno;
import util.Util;

public class TelaDadosAluno extends JFrame {

	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	JLabel nomeLabel, telefoneLabel, enderecoLabel, cpfLabel, idLabel, saldoDevedorLabel, dataLabel;
	JTextField nomeField, telefoneField, enderecofield, idField, saldoDevedorField;
	JFormattedTextField dataFormatField, cpfFormatField;
	
	Aluno aluno;
	CRUD crud;
	ButtonHandlerPesquisa handlerPesquisa;
	TelaPesquisaAluno telaPesquisaAluno;
	private JLabel lblTelaDados;

	public TelaDadosAluno(Aluno aluno) {
		super("Dados Do Aluno");
		getContentPane().setBackground(Color.BLACK);
		
		this.aluno=aluno;
		getContentPane().setLayout(null);
		
		handlerPesquisa=new ButtonHandlerPesquisa(telaPesquisaAluno);
		
		nomeLabel=new JLabel("Nome: ");
		nomeLabel.setForeground(Color.CYAN);
		nomeLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		telefoneLabel=new JLabel("Telefone: ");
		telefoneLabel.setForeground(Color.CYAN);
		telefoneLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		enderecoLabel=new JLabel("Endereço: ");
		enderecoLabel.setForeground(Color.CYAN);
		enderecoLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfLabel=new JLabel("CPF: ");
		cpfLabel.setForeground(Color.CYAN);
		cpfLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		idLabel=new JLabel("ID: ");
		idLabel.setForeground(Color.CYAN);
		idLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		saldoDevedorLabel=new JLabel("Saldo Devedor: ");
		saldoDevedorLabel.setForeground(Color.CYAN);
		saldoDevedorLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		dataLabel=new JLabel("Última mensalidade paga:" );
		dataLabel.setForeground(Color.CYAN);
		dataLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		getContentPane().add(nomeLabel);
		getContentPane().add(telefoneLabel);
		getContentPane().add(enderecoLabel);
		getContentPane().add(cpfLabel);
		getContentPane().add(idLabel);
		getContentPane().add(saldoDevedorLabel);
		getContentPane().add(dataLabel);
		
		nomeLabel.setBounds(10, 32, 53, 30);
		telefoneLabel.setBounds(10, 165, 73, 30);
		enderecoLabel.setBounds(10, 99, 84, 30);
		cpfLabel.setBounds(10, 239, 42, 30);
		idLabel.setBounds(204, 165, 35, 30);
		saldoDevedorLabel.setBounds(204, 239, 106, 30);
		dataLabel.setBounds(10, 328, 180, 30);
		
		//=====================================================================================================================		
		nomeField=new JTextField(aluno.getNome());
		nomeField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		telefoneField=new JTextField(aluno.getTelefone());
		telefoneField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		enderecofield=new JTextField(aluno.getEndereco());
		enderecofield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		cpfFormatField=new JFormattedTextField(Util.Mascara("###.###.###-##"));
		cpfFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		idField=new JTextField(aluno.getId());
		idField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		saldoDevedorField=new JTextField(String.valueOf(aluno.getSaldoDevedor()));
		saldoDevedorField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		getContentPane().add(nomeField);
		getContentPane().add(telefoneField);
		getContentPane().add(enderecofield);
		getContentPane().add(cpfFormatField);
		getContentPane().add(idField);
		getContentPane().add(saldoDevedorField);
		
		nomeField.setBounds(10, 58, 249, 30);
		telefoneField.setBounds(10, 198, 140, 30);
		enderecofield.setBounds(10, 128, 249, 30);
		cpfFormatField.setBounds(10, 268, 127, 30);
		idField.setBounds(204, 198, 42, 30);
		saldoDevedorField.setBounds(204, 268, 73, 30);
		
		nomeField.setText(aluno.getNome());
		telefoneField.setText(aluno.getTelefone());
		enderecofield.setText(aluno.getEndereco());
		cpfFormatField.setText(aluno.getCPF());
		idField.setText(String.valueOf(aluno.getId()));
		saldoDevedorField.setText(String.valueOf(aluno.getSaldoDevedor()));
		dataFormatField=new JFormattedTextField(Util.Mascara("##/##/####"));
		dataFormatField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		getContentPane().add(dataFormatField);
		dataFormatField.setBounds(204, 329, 84, 30);
		dataFormatField.setText(aluno.getData());
		
		lblTelaDados = new JLabel("Tela Dados");
		lblTelaDados.setForeground(Color.CYAN);
		lblTelaDados.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblTelaDados.setBounds(253, 11, 121, 24);
		getContentPane().add(lblTelaDados);
		
		setSize(400, 453);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
