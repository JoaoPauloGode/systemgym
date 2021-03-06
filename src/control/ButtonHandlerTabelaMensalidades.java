package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.Conexao;
import util.Util;
import view.TelaListaMensalidades;

public class ButtonHandlerTabelaMensalidades {
	
	TelaListaMensalidades telaListaMensalidades;

	public ButtonHandlerTabelaMensalidades(TelaListaMensalidades telaListaMensalidades) {
		this.telaListaMensalidades = telaListaMensalidades;
	}
	
	public void inserirMensalidadeQuitada() throws Exception {
		
		PreparedStatement p =  Conexao.con.prepareStatement("select nome, cpf, dataCadastro from alunos order by nome");
		
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			telaListaMensalidades.getModel().addRow(new Object[] {rs.getString("nome"), Util.tratadoraDeCPF(rs.getString("cpf")), Util.tratadoraDeData(rs.getString("dataCadastro"))});
		}
	}
}
