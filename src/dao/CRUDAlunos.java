package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Aluno;
import view.TelaCadastroAluno;

public class CRUDAlunos {

	public static Statement stmt;

	public void create(TelaCadastroAluno telaCadastroAluno) {
		try {
			stmt = Conexao.con.createStatement(); 

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

			stmt = Conexao.con.createStatement();   	
			stmt.executeUpdate("DELETE FROM alunos WHERE id = "+id);

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
			}
		} catch(SQLException e) {

			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
		}

		return aluno;
	}

	public ArrayList<Aluno> listAll() throws Exception {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		stmt = Conexao.con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM alunos");
		
		Aluno aluno = new Aluno();
		while(rs.next()){

			aluno.setNome(rs.getString("nome"));
			aluno.setEndereco(rs.getString("endereco"));
			aluno.setCPF(rs.getString("cpf"));
			aluno.setSaldoDevedor(Double.parseDouble(rs.getString("saldoDevedor")));
			aluno.setTelefone(rs.getString("telefone"));

			alunos.add(aluno);
			System.out.println(alunos.get(0).getNome());
		}
		rs.close();
		return alunos;
	}

}



