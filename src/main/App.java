package main;

import dao.Conexao;
import view.TelaInicial;

public class App {

	public static void main(String[] args) {
		Conexao.getConnection();
		new TelaInicial();

	}
}
