package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.Conexao;
import view.TelaListaMensalidades;

public class ButtonHandlerTabelaMensalidades {
	
	TelaListaMensalidades telaListaMensalidades;

	public ButtonHandlerTabelaMensalidades(TelaListaMensalidades telaListaMensalidades) {
		this.telaListaMensalidades = telaListaMensalidades;
	}
	
	public void inserirMensalidadeQuitada() throws Exception {
		
		PreparedStatement p =  Conexao.con.prepareStatement("select cpfM, datas from mensalidades as ms inner join alunos as al on ms.cpfM=al.cpf");
		
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			telaListaMensalidades.getModel().addColumn(new Object[] {rs.getString("cpfM"), rs.getString("datas")});
		}
	}
}
