package dao;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import view.TelaQuitaMensalidade;

public class CRUDMensalidades {

	public static Statement stmt;

	public void insertMensalidade(TelaQuitaMensalidade telaQuitaMensalidade, String cpf, String data) {
		try {
			stmt = Conexao.con.createStatement(); 
			stmt.executeUpdate("INSERT INTO mensalidades (cpfM, datas) VALUES "
					+ "('" + telaQuitaMensalidade.getCpfFormatField().getText().replaceAll("\\D", "") + "','"
					+ telaQuitaMensalidade.getDataFormatField().getText().replaceAll("\\D", "")
					+"')");
			JOptionPane.showMessageDialog(null, "Mensalidade Paga Com Sucesso");

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}  

	public void listAllMensalidades() {
		try {
			stmt = Conexao.con.createStatement(); 
			stmt.executeUpdate("select cpfM, datas from mensalidades as ms inner join alunos as al on ms.cpfM=al.cpf"
					+ "group by cpfM");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
