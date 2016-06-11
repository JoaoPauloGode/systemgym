package dao;

import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import view.TelaCadastroAluno;

public class CRUD {
	static public Statement stmt;

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
}


