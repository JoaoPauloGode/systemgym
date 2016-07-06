package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.Conexao;
import util.Util;
import view.TelaListaAlunos;

public class ButtonHandlerTabelaAlunos {

	private TelaListaAlunos telaListaAlunos;

	public ButtonHandlerTabelaAlunos(TelaListaAlunos telaListaAlunos) {
		this.telaListaAlunos=telaListaAlunos;
	}

	public void inserirLinha() throws Exception {

		PreparedStatement p =  Conexao.con.prepareStatement("select * from alunos order by nome");
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			telaListaAlunos.getModel().addRow(new Object[] {rs.getString("nome"), Util.tratadoraDeTelefone(rs.getString("telefone")), 
					rs.getString("endereco"), Util.tratadoraDeCPF(rs.getString("cpf")), rs.getString("saldoDevedor")});
		}
	}
}
