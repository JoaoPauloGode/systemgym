package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.ButtonHandlerTabelaMensalidades;

public class TelaListaMensalidades extends JFrame {

	/**
	 * @author Joao Paulo
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	private ButtonHandlerTabelaMensalidades handlerTabelaMensalidades;

	public TelaListaMensalidades() throws SQLException, Exception {
		super("Listar Mensalidades");
		
		setLayout(new BorderLayout());

		model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("CPF");
		model.addColumn("Utima Mensalidade Paga");
		
		handlerTabelaMensalidades=new ButtonHandlerTabelaMensalidades(this);

		try {
			handlerTabelaMensalidades.inserirMensalidadeQuitada();
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

		setSize(500, 500);
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
