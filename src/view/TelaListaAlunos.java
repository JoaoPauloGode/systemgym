package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.ButtonHandlerTabelaAlunos;

public class TelaListaAlunos extends JFrame {

	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	private ButtonHandlerTabelaAlunos handlerTabela;

	public TelaListaAlunos() {
		super("Listar Alunos");

		setLayout(new BorderLayout());

		model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("Telefone");
		model.addColumn("Endereco");
		model.addColumn("CPF");
		model.addColumn("Saldo Devedor");
		handlerTabela=new ButtonHandlerTabelaAlunos(this);
		try {
			handlerTabela.inserirLinha();
		} catch (Exception e) {
			e.printStackTrace();
		}

		table = new JTable(model);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		table.setForeground(Color.CYAN);
		table.setBackground(Color.BLACK);
		table.setCellEditor(null);
		table.setSelectionBackground(Color.WHITE);

		scroll = new JScrollPane(table);		
		add(scroll,BorderLayout.CENTER);

		setSize(700, 400);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

}
