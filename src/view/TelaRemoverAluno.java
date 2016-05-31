package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.ListaDeAlunos;
import control.ButtonHandlerRemoveAluno;

public class TelaRemoverAluno extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel idLabel, telaFundoLabel;;
	private JTextField idField;
	private JButton removerButton;
	
	private ButtonHandlerRemoveAluno handlerAluno;
	ListaDeAlunos listaAlunos;
	
	public TelaRemoverAluno(ListaDeAlunos listaDeAlunos) {
		super("Tela de Remoção");
		
		this.listaAlunos=listaDeAlunos;
		
		handlerAluno=new ButtonHandlerRemoveAluno(this, listaDeAlunos);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		idLabel=new JLabel("Inssira o ID Para Remoção: ");
		telaFundoLabel.add(idLabel);
		idLabel.setBounds(20, 20, 160, 30);
		
		idField=new JTextField(5);
		telaFundoLabel.add(idField);
		idField.setBounds(180, 20, 30, 30);
		
		removerButton=new JButton("Remover");
		telaFundoLabel.add(removerButton);
		removerButton.setBounds(360, 400, 120, 30);
		
		removerButton.addActionListener(handlerAluno);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public JButton getRemoverButton() {
		return removerButton;
	}

	public JTextField getIdField() {
		return idField;
	}

}
