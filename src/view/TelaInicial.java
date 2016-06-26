package view;

import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import control.ButtonHandler;
import control.RadioButtonHandler;

public class TelaInicial extends JFrame {
	
	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel telaFundoLabel;
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
		
		telaFundoLabel=new JLabel(new ImageIcon("res\\simbolo.jpg"));
		add(telaFundoLabel);
		
		/**
		 * ================================================================
		 */
		alunoRadioButton=new JRadioButton("Aluno");
		mensalidadeRadioButton=new JRadioButton("Mensalidade");
		vendaRadioButton=new JRadioButton("Venda/Pagamento");
		
		telaFundoLabel.add(alunoRadioButton);
		telaFundoLabel.add(mensalidadeRadioButton);
		telaFundoLabel.add(vendaRadioButton);
		
		alunoRadioButton.setBounds(20, 20, 135, 30);
		mensalidadeRadioButton.setBounds(20, 60, 135, 30);
		vendaRadioButton.setBounds(20, 100, 135, 30);
		
		bg=new ButtonGroup();
		bg.add(alunoRadioButton);
		bg.add(mensalidadeRadioButton);
		bg.add(vendaRadioButton);
		
		/**
		 * ================================================================
		 */
		
		cadastrarAlunoButton=new JButton("Cadastrar Aluno");
		removerAlunoButton=new JButton("Remover Aluno");
		listarAlunoButton=new JButton("Listar Aluno");
		pesquisarAlunoButton=new JButton("Pesquisar Aluno");
		
		telaFundoLabel.add(cadastrarAlunoButton);
		telaFundoLabel.add(removerAlunoButton);
		telaFundoLabel.add(listarAlunoButton);
		telaFundoLabel.add(pesquisarAlunoButton);
		
		cadastrarAlunoButton.setBounds(350, 300, 140, 30);
		removerAlunoButton.setBounds(350, 340, 140, 30);
		listarAlunoButton.setBounds(350, 380, 140, 30);
		pesquisarAlunoButton.setBounds(350, 420, 140, 30);
		
		cadastrarAlunoButton.setVisible(false);
		removerAlunoButton.setVisible(false);
		listarAlunoButton.setVisible(false);
		pesquisarAlunoButton.setVisible(false);
		//=================================================================
		quitarMensalidadeButton=new JButton("Quitar Mensalidade");
		listarMensalidadesButton=new JButton("Listar Mensalidades");
		
		telaFundoLabel.add(quitarMensalidadeButton);
		telaFundoLabel.add(listarMensalidadesButton);
		
		quitarMensalidadeButton.setBounds(340, 380, 150, 30);
		listarMensalidadesButton.setBounds(340, 420, 150, 30);
		
		quitarMensalidadeButton.setVisible(false);
		listarMensalidadesButton.setVisible(false);
		//=================================================================
		realizarVendaButton=new JButton("Efetuar Venda");
		realizarPagamentoButton=new JButton("Efetuar Pagamento");
		
		telaFundoLabel.add(realizarVendaButton);
		telaFundoLabel.add(realizarPagamentoButton);
		
		realizarVendaButton.setBounds(340, 420, 150, 30);
		realizarPagamentoButton.setBounds(340, 380, 150, 30);
		
		realizarVendaButton.setVisible(false);
		realizarPagamentoButton.setVisible(false);
		
		/**
		 * ================================================================
		 */
		
		alunoRadioButton.addActionListener(handlerR);
		mensalidadeRadioButton.addActionListener(handlerR);
		vendaRadioButton.addActionListener(handlerR);
		
		quitarMensalidadeButton.addMouseListener(handlerQuitaMensalidade);
		listarMensalidadesButton.addMouseListener(handlerListaMensalidades);
		
		cadastrarAlunoButton.addMouseListener(handlerCadAl);
		removerAlunoButton.addMouseListener(handlerRemAl);
		realizarVendaButton.addMouseListener(handlervenda);
		realizarPagamentoButton.addMouseListener(handlerPagamento);
		pesquisarAlunoButton.addMouseListener(handlerPesquisa);
		listarAlunoButton.addMouseListener(handlertabela);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}	
	
	public JLabel getTelaFundoLabel() {
		return telaFundoLabel;
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
