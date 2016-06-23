package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ButtonHandlerRemoveAluno;

public class TelaRemoverAluno extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cpfLabel, telaFundoLabel;;
	private JFormattedTextField cpfFormatField;
	private JButton removerButton;
	
	private ButtonHandlerRemoveAluno handlerAluno;
	
	public TelaRemoverAluno() {
		super("Tela de Remoção");
		
		handlerAluno=new ButtonHandlerRemoveAluno(this);
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		cpfLabel=new JLabel("Inssira o CPF Para Remoção: ");
		telaFundoLabel.add(cpfLabel);
		cpfLabel.setBounds(20, 20, 180, 30);
		
		cpfFormatField=new JFormattedTextField(handlerAluno.Mascara("###.###.###-##"));
		telaFundoLabel.add(cpfFormatField);
		cpfFormatField.setBounds(190, 20, 120, 30);
		
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

	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}

}
