package dao;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import view.TelaCadastroAluno;
import view.TelaRemoverAluno;

public class CRUD {
	
	static public Statement stmt;
	TelaRemoverAluno telaRemoverAluno;

	public void create(TelaCadastroAluno telaCadastroAluno) {
		try {
			stmt = (Statement) Conexao.con.createStatement(); 

			stmt.executeUpdate("INSERT INTO alunos (nome, telefone, endereco, cpf, saldoDevedor) VALUES "
					+ "('" + telaCadastroAluno.getNomeField().getText() + "','"
					+ telaCadastroAluno.getTelefoneFormatField().getText().replaceAll("\\D", "") + "','"
					+ telaCadastroAluno.getEnderecoField().getText() + "','"
					+ telaCadastroAluno.getCpfFormatField().getText().replaceAll("\\D", "") + "','"
					+0.0
					+"')");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}  
	
	public void delete(int id) {
		try {

			stmt = (Statement) Conexao.con.createStatement();   	
			stmt.executeUpdate("DELETE FROM alunos WHERE id = "+id);

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	public void updateVenda(int id, double saldoDevedor) {
		try {
			stmt =(Statement) Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE alunos SET saldoDevedor = saldoDevedor + " + saldoDevedor + "WHERE id = " + id);
			JOptionPane.showMessageDialog(null, "Venda Efetuada");
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}

	public void updatePagamento(int id, double saldoDevedor) {
		try {
			stmt =(Statement) Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE alunos SET saldoDevedor = saldoDevedor - " + saldoDevedor + "WHERE id = " + id);
			JOptionPane.showMessageDialog(null, "Pagamento Efetuado");
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
}


