package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.Aluno;
import view.TelaCadastroAluno;
import view.TelaDadosAluno;

public class CRUD {

	public static Statement stmt;

	public void create(TelaCadastroAluno telaCadastroAluno) {
		try {
			stmt = Conexao.con.createStatement(); 

			stmt.executeUpdate("INSERT INTO alunos (nome, telefone, endereco, cpf, saldoDevedor, dataCadastro) VALUES "
					+ "('" + telaCadastroAluno.getNomeField().getText() + "','"
					+ telaCadastroAluno.getTelefoneFormatField().getText().replaceAll("\\D", "") + "','"
					+ telaCadastroAluno.getEnderecoField().getText() + "','"
					+ telaCadastroAluno.getCpfFormatField().getText().replaceAll("\\D", "") + "','"
					+0.0 + "','"
					+telaCadastroAluno.getDataFormatField().getText().replaceAll("\\D", "")
					+"')");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}  

	public void delete(String cpf) {
		try {

			stmt = Conexao.con.createStatement();   	
			stmt.executeUpdate("DELETE FROM alunos WHERE cpf = "+cpf);

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}

	public void updateVenda(String cpf, double saldoDevedor) {
		try {
			stmt = Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE alunos SET saldoDevedor = saldoDevedor + " + saldoDevedor + "WHERE cpf = " + cpf);
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}

	public void updatePagamento(String cpf, double saldoDevedor) {
		try {
			stmt = Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE alunos SET saldoDevedor = saldoDevedor - " + saldoDevedor + "WHERE cpf = " + cpf);
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	public void updatePagaMensalidade(String cpf, String data) {
		try {
			stmt = Conexao.con.createStatement();
			stmt.executeUpdate("UPDATE alunos SET dataCadastro = "+ data + " WHERE cpf = " + cpf);
			JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso");
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		}
	}

	public Aluno select(String cpf) {
		Aluno aluno = new Aluno();
		try {
			stmt = Conexao.con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM alunos WHERE cpf ="+cpf);

			while (rs.next()) {			
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setCPF(rs.getString("cpf"));
				aluno.setTelefone(rs.getString("telefone"));
				aluno.setEndereco(rs.getString("endereco"));
				aluno.setSaldoDevedor(rs.getDouble("saldoDevedor"));
				aluno.setData(rs.getString("dataCadastro"));
				new TelaDadosAluno(aluno);
			}
		} catch(SQLException e) {

			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
		}

		return aluno;
	}

	public void listAll() throws Exception {

		stmt = Conexao.con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM alunos");

		Aluno aluno = new Aluno();
		while(rs.next()) {

			aluno.setNome(rs.getString("nome"));
			aluno.setEndereco(rs.getString("endereco"));
			aluno.setCPF(rs.getString("cpf"));
			aluno.setSaldoDevedor(Double.parseDouble(rs.getString("saldoDevedor")));
			aluno.setTelefone(rs.getString("telefone"));
			aluno.setData(rs.getString("dataCadastro"));

		}
		rs.close();
	}
	
}



