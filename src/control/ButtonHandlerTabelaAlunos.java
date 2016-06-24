package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.Conexao;
import view.TelaListaAlunos;

public class ButtonHandlerTabelaAlunos {
	
	private TelaListaAlunos telaListaAlunos;
	
	public ButtonHandlerTabelaAlunos(TelaListaAlunos telaListaAlunos) {
		this.telaListaAlunos=telaListaAlunos;
	}
	
	public void inserirLinha() throws Exception {
		
		PreparedStatement p =  Conexao.con.prepareStatement("select * from alunos");
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			telaListaAlunos.getModel().addRow(new Object[] {rs.getString("nome"), rs.getString("telefone"), 
					rs.getString("endereco"), rs.getString("cpf"), rs.getString("saldoDevedor"), rs.getString("dataCadastro")});
		}
	}
}
