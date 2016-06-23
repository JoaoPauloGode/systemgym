package view;

import java.awt.BorderLayout;
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
		
//		JTable table = new JTable();
//		String[] nomesColunas = {"cpf", "datas"};
//		new CRUDMensalidades().stmt = Conexao.con.createStatement(); 
//		ResultSet rs=new CRUDMensalidades().stmt.executeQuery("select cpfM, datas from mensalidades as ms inner join alunos as al on ms.cpfM=al.cpf"
//				+ "group by cpfM");
//		//essa lista terá as linhas da sua JTable, preenchi abaixo apenas como exemplo
//		ArrayList<Mensalidade> lista =new ArrayList<>();
//		//ArrayList<Mensalida> lista = new ArrayList<>();
//		//aqui você fará um while percorrendo seu result set e adicionando na lista
//		while(rs.next()) {
//			handlerTabelaMensalidades.inserirMensalidadeQuitada();
//		}
////		lista.add(rs.getString(columnIndex));
////		lista.add(new String[]{"Henrique", "rua 42", "1122-3344"});
////		lista.add(new String[]{"Manuel", "av 7 de setembro", "8765-4321"});
//		//} //fim while
//		//crie um defaultablemodel com as informações acima
//		DefaultTableModel model = new DefaultTableModel(
//		        lista.toArray(new String[lista.size()][]), nomesColunas);
//		//define o model da sua tabela
//		table.setModel(model);
//		//adiciona no contentpane, coloque dentro de um JScrollPane pois caso 
//		//contrário não aparecerão os nomes das colunas
//		add(new JScrollPane(table), BorderLayout.CENTER);

		setLayout(new BorderLayout());

		model = new DefaultTableModel();
		model.addColumn("CPF");
		model.addColumn("Datas");
		handlerTabelaMensalidades=new ButtonHandlerTabelaMensalidades(this);

		try {
			handlerTabelaMensalidades.inserirMensalidadeQuitada();
		} catch (Exception e) {
			e.printStackTrace();
		}

		table = new JTable(model);

		scroll = new JScrollPane(table);		
		add(scroll,BorderLayout.CENTER);

		setSize(500, 500);
		setResizable(false);
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
