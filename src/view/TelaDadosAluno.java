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
	JLabel telaFundoLabel;
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
		
		nomeField.setBounds(50, 50, 180, 30);
		telefoneField.setBounds(50, 90, 180, 30);
		enderecofield.setBounds(50, 130, 180, 30);
		cpfField.setBounds(50, 170, 180, 30);
		idField.setBounds(50, 210, 180, 30);
		saldoDevedorField.setBounds(50, 250, 180, 30);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
