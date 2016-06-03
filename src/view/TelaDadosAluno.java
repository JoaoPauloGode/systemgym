package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ButtonHandlerPesquisa;
import dao.EscreverXML;
import model.ListaDeAlunos;

public class TelaDadosAluno extends JFrame {

	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	JLabel telaFundoLabel, nomeLabel, telefoneLabel, enderecoLabel, cpfLabel, idLabel, saldoDevedorLabel;
	JTextField nomeField, telefoneField, enderecofield, cpfField, idField, saldoDevedorField;
	
	ListaDeAlunos listaDeAlunos;
	ButtonHandlerPesquisa handlerPesquisa;
	TelaPesquisaAluno telaPesquisaAluno;
	EscreverXML escreverXML;

	public TelaDadosAluno() {
		super("Dados Do Aluno");

		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		escreverXML=new EscreverXML(listaDeAlunos);
		listaDeAlunos=new ListaDeAlunos(escreverXML.buscarXML());
		
		handlerPesquisa=new ButtonHandlerPesquisa(telaPesquisaAluno, listaDeAlunos);
		
		nomeLabel=new JLabel("Nome: ");
		telefoneLabel=new JLabel("Telefone: ");
		enderecoLabel=new JLabel("Endereço: ");
		cpfLabel=new JLabel("CPF: ");
		idLabel=new JLabel("ID: ");
		saldoDevedorLabel=new JLabel("Saldo Devedor: ");
		
		telaFundoLabel.add(nomeLabel);
		telaFundoLabel.add(telefoneLabel);
		telaFundoLabel.add(enderecoLabel);
		telaFundoLabel.add(cpfLabel);
		telaFundoLabel.add(idLabel);
		telaFundoLabel.add(saldoDevedorLabel);
		
		nomeLabel.setBounds(20, 50, 180, 30);
		telefoneLabel.setBounds(20, 90, 180, 30);
		enderecoLabel.setBounds(20, 130, 180, 30);
		cpfLabel.setBounds(20, 170, 180, 30);
		idLabel.setBounds(20, 210, 180, 30);
		saldoDevedorLabel.setBounds(20, 250, 180, 30);
		//=====================================================================================================================		
		nomeField=new JTextField(listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getNome());
		telefoneField=new JTextField(listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getTelefone());
		enderecofield=new JTextField(listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getEndereco());
		cpfField=new JTextField(listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getCPF());
		idField=new JTextField(""+listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getId());
		saldoDevedorField=new JTextField(""+listaDeAlunos.listaAlunos.get(handlerPesquisa.getPosId()).getSaldoDevedor());
		
		telaFundoLabel.add(nomeField);
		telaFundoLabel.add(telefoneField);
		telaFundoLabel.add(enderecofield);
		telaFundoLabel.add(cpfField);
		telaFundoLabel.add(idField);
		telaFundoLabel.add(saldoDevedorField);
		
		nomeField.setBounds(70, 50, 190, 30);
		telefoneField.setBounds(80, 90, 180, 30);
		enderecofield.setBounds(80, 130, 180, 30);
		cpfField.setBounds(50, 170, 210, 30);
		idField.setBounds(45, 210, 215, 30);
		saldoDevedorField.setBounds(110, 250, 150, 30);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
