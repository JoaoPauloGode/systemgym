package view;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPesquisa;
import dao.CRUD;
import model.Aluno;

public class TelaDadosAluno extends JFrame {

	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	JLabel telaFundoLabel, nomeLabel, telefoneLabel, enderecoLabel, cpfLabel, idLabel, saldoDevedorLabel, dataLabel;
	JTextField nomeField, telefoneField, enderecofield, idField, saldoDevedorField;
	JFormattedTextField dataFormatField, cpfFormatField;
	
	Aluno aluno;
	CRUD crud;
	ButtonHandlerPesquisa handlerPesquisa;
	TelaPesquisaAluno telaPesquisaAluno;

	public TelaDadosAluno(Aluno aluno) {
		super("Dados Do Aluno");
		
		this.aluno=aluno;
		getContentPane().setLayout(null);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		telaFundoLabel.setBounds(0, 0, 484, 462);
		getContentPane().add(telaFundoLabel);
		
		handlerPesquisa=new ButtonHandlerPesquisa(telaPesquisaAluno);
		
		nomeLabel=new JLabel("Nome: ");
		telefoneLabel=new JLabel("Telefone: ");
		enderecoLabel=new JLabel("Endereço: ");
		cpfLabel=new JLabel("CPF: ");
		idLabel=new JLabel("ID: ");
		saldoDevedorLabel=new JLabel("Saldo Devedor: ");
		dataLabel=new JLabel("Última mensalidade paga:" );
		
		telaFundoLabel.add(nomeLabel);
		telaFundoLabel.add(telefoneLabel);
		telaFundoLabel.add(enderecoLabel);
		telaFundoLabel.add(cpfLabel);
		telaFundoLabel.add(idLabel);
		telaFundoLabel.add(saldoDevedorLabel);
		telaFundoLabel.add(dataLabel);
		
		nomeLabel.setBounds(20, 50, 180, 30);
		telefoneLabel.setBounds(20, 90, 180, 30);
		enderecoLabel.setBounds(20, 130, 180, 30);
		cpfLabel.setBounds(20, 170, 180, 30);
		idLabel.setBounds(20, 210, 180, 30);
		saldoDevedorLabel.setBounds(20, 250, 180, 30);
		dataLabel.setBounds(20, 290, 180, 30);
		
		//=====================================================================================================================		
		nomeField=new JTextField(aluno.getNome());
		telefoneField=new JTextField(aluno.getTelefone());
		enderecofield=new JTextField(aluno.getEndereco());
		cpfFormatField=new JFormattedTextField(handlerPesquisa.Mascara("###.###.###-##"));
		idField=new JTextField(aluno.getId());
		saldoDevedorField=new JTextField(String.valueOf(aluno.getSaldoDevedor()));
		
		telaFundoLabel.add(nomeField);
		telaFundoLabel.add(telefoneField);
		telaFundoLabel.add(enderecofield);
		telaFundoLabel.add(cpfFormatField);
		telaFundoLabel.add(idField);
		telaFundoLabel.add(saldoDevedorField);
		
		nomeField.setBounds(70, 50, 190, 30);
		telefoneField.setBounds(80, 90, 180, 30);
		enderecofield.setBounds(80, 130, 180, 30);
		cpfFormatField.setBounds(50, 170, 210, 30);
		idField.setBounds(45, 210, 215, 30);
		saldoDevedorField.setBounds(110, 250, 150, 30);
		
		nomeField.setText(aluno.getNome());
		telefoneField.setText(aluno.getTelefone());
		enderecofield.setText(aluno.getEndereco());
		cpfFormatField.setText(aluno.getCPF());
		idField.setText(String.valueOf(aluno.getId()));
		saldoDevedorField.setText(String.valueOf(aluno.getSaldoDevedor()));
		dataFormatField=new JFormattedTextField(handlerPesquisa.Mascara("##/##/####"));
		getContentPane().add(dataFormatField);
		dataFormatField.setBounds(159, 289, 100, 30);
		dataFormatField.setText(aluno.getData());
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
