package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import control.ButtonHandler;
import control.RadioButtonHandler;

public class TelaInicial extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton cadastrarAlunoButton, removerAlunoButton, listarAlunoButton, pesquisarAlunoButton,
	realizarVendaButton, realizarPagamentoButton, listarMensalidadesButton, quitarMensalidadeButton;
	private JRadioButton alunoRadioButton, mensalidadeRadioButton, vendaRadioButton;
	private ButtonGroup bg;
	
	RadioButtonHandler handlerR;
	ButtonHandler handlerCadAl;
	ButtonHandler handlerRemAl;
	ButtonHandler handlervenda;
	ButtonHandler handlerPagamento;
	ButtonHandler handlerPesquisa;
	ButtonHandler handlertabela;
	ButtonHandler handlerQuitaMensalidade;
	ButtonHandler handlerListaMensalidades;
	
	public TelaInicial() {
		super("Tela Inicial");
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("res\\qn.jpg"));
		
		handlerR=new RadioButtonHandler(this);
		handlerCadAl=new ButtonHandler(this);
		handlerRemAl=new ButtonHandler(this);
		handlervenda=new ButtonHandler(this);
		handlerPagamento=new ButtonHandler(this);
		handlerPesquisa=new ButtonHandler(this);
		handlertabela=new ButtonHandler(this);
		handlerQuitaMensalidade=new ButtonHandler(this);
		handlerListaMensalidades=new ButtonHandler(this);
		
		getContentPane().setLayout(null);
		
		/**
		 * ================================================================
		 */
		alunoRadioButton=new JRadioButton("Aluno");
		alunoRadioButton.setBackground(Color.BLACK);
		alunoRadioButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		alunoRadioButton.setForeground(Color.CYAN);
		mensalidadeRadioButton=new JRadioButton("Mensalidade");
		mensalidadeRadioButton.setBackground(Color.BLACK);
		mensalidadeRadioButton.setForeground(Color.CYAN);
		mensalidadeRadioButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		vendaRadioButton=new JRadioButton("Venda/Pagamento");
		vendaRadioButton.setBackground(Color.BLACK);
		vendaRadioButton.setForeground(Color.CYAN);
		vendaRadioButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		getContentPane().add(alunoRadioButton);
		getContentPane().add(mensalidadeRadioButton);
		getContentPane().add(vendaRadioButton);
		
		alunoRadioButton.setBounds(6, 7, 135, 30);
		mensalidadeRadioButton.setBounds(6, 40, 135, 30);
		vendaRadioButton.setBounds(6, 73, 150, 30);
		
		bg=new ButtonGroup();
		bg.add(alunoRadioButton);
		bg.add(mensalidadeRadioButton);
		bg.add(vendaRadioButton);
		
		/**
		 * ================================================================
		 */
		
		cadastrarAlunoButton=new JButton("Cadastrar Aluno");
		cadastrarAlunoButton.setBackground(Color.CYAN);
		removerAlunoButton=new JButton("Remover Aluno");
		removerAlunoButton.setBackground(Color.CYAN);
		listarAlunoButton=new JButton("Listar Aluno");
		listarAlunoButton.setBackground(Color.CYAN);
		pesquisarAlunoButton=new JButton("Pesquisar Aluno");
		pesquisarAlunoButton.setBackground(Color.CYAN);
		
		getContentPane().add(cadastrarAlunoButton);
		getContentPane().add(removerAlunoButton);
		getContentPane().add(listarAlunoButton);
		getContentPane().add(pesquisarAlunoButton);
		
		cadastrarAlunoButton.setBounds(283, 208, 140, 30);
		removerAlunoButton.setBounds(283, 249, 140, 30);
		listarAlunoButton.setBounds(283, 288, 140, 30);
		pesquisarAlunoButton.setBounds(283, 329, 140, 30);
		
		cadastrarAlunoButton.setVisible(false);
		removerAlunoButton.setVisible(false);
		listarAlunoButton.setVisible(false);
		pesquisarAlunoButton.setVisible(false);
		//=================================================================
		quitarMensalidadeButton=new JButton("Quitar Mensalidade");
		quitarMensalidadeButton.setBackground(Color.CYAN);
		listarMensalidadesButton=new JButton("Listar Mensalidades");
		listarMensalidadesButton.setBackground(Color.CYAN);
		
		getContentPane().add(quitarMensalidadeButton);
		getContentPane().add(listarMensalidadesButton);
		
		quitarMensalidadeButton.setBounds(273, 290, 150, 30);
		listarMensalidadesButton.setBounds(273, 331, 150, 30);
		
		quitarMensalidadeButton.setVisible(false);
		listarMensalidadesButton.setVisible(false);
		//=================================================================
		realizarVendaButton=new JButton("Efetuar Venda");
		realizarVendaButton.setBackground(Color.CYAN);
		realizarVendaButton.setForeground(Color.BLACK);
		realizarPagamentoButton=new JButton("Efetuar Pagamento");
		realizarPagamentoButton.setBackground(Color.CYAN);
		realizarPagamentoButton.setForeground(Color.BLACK);
		
		getContentPane().add(realizarVendaButton);
		getContentPane().add(realizarPagamentoButton);
		
		realizarVendaButton.setBounds(273, 290, 150, 30);
		realizarPagamentoButton.setBounds(273, 331, 150, 30);
		
		realizarVendaButton.setVisible(false);
		realizarPagamentoButton.setVisible(false);
		
		/**
		 * ================================================================
		 */
		
		alunoRadioButton.addActionListener(handlerR);
		mensalidadeRadioButton.addActionListener(handlerR);
		vendaRadioButton.addActionListener(handlerR);
		
		quitarMensalidadeButton.addActionListener(handlerQuitaMensalidade);
		listarMensalidadesButton.addActionListener(handlerListaMensalidades);
		
		cadastrarAlunoButton.addActionListener(handlerCadAl);
		removerAlunoButton.addActionListener(handlerRemAl);
		realizarVendaButton.addActionListener(handlervenda);
		realizarPagamentoButton.addActionListener(handlerPagamento);
		pesquisarAlunoButton.addActionListener(handlerPesquisa);
		listarAlunoButton.addActionListener(handlertabela);
		
		setSize(439, 398);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}	
	
	public JButton getCadastrarAlunoButton() {
		return cadastrarAlunoButton;
	}

	public void setCadastrarAlunoButton(JButton cadastrarAlunoButton) {
		this.cadastrarAlunoButton = cadastrarAlunoButton;
	}

	public JButton getRemoverAlunoButton() {
		return removerAlunoButton;
	}

	public void setRemoverAlunoButton(JButton removerAlunoButton) {
		this.removerAlunoButton = removerAlunoButton;
	}

	public JButton getListarAlunoButton() {
		return listarAlunoButton;
	}

	public void setListarAlunoButton(JButton listarAlunoButton) {
		this.listarAlunoButton = listarAlunoButton;
	}

	public JButton getPesquisarAlunoButton() {
		return pesquisarAlunoButton;
	}

	public void setPesquisarAlunoButton(JButton pesquisarAlunoButton) {
		this.pesquisarAlunoButton = pesquisarAlunoButton;
	}

	public JButton getRealizarVendaButton() {
		return realizarVendaButton;
	}

	public void setRealizarVendaButton(JButton realizarVendaButton) {
		this.realizarVendaButton = realizarVendaButton;
	}

	public JButton getRealizarPagamentoButton() {
		return realizarPagamentoButton;
	}

	public void setRealizarPagamentoButton(JButton realizarPagamentoButton) {
		this.realizarPagamentoButton = realizarPagamentoButton;
	}

	public JButton getListarMensalidadesButton() {
		return listarMensalidadesButton;
	}

	public void setListarMensalidadesButton(JButton listarMensalidadesButton) {
		this.listarMensalidadesButton = listarMensalidadesButton;
	}

	public JButton getQuitarMensalidadeButton() {
		return quitarMensalidadeButton;
	}

	public void setQuitarMensalidadeButton(JButton quitarMensalidadeButton) {
		this.quitarMensalidadeButton = quitarMensalidadeButton;
	}

	public JRadioButton getAlunoRadioButton() {
		return alunoRadioButton;
	}

	public JRadioButton getMensalidadeRadioButton() {
		return mensalidadeRadioButton;
	}

	public JRadioButton getVendaRadioButton() {
		return vendaRadioButton;
	}
}
