package main;

import java.io.IOException;

import dao.Conexao;
import view.TelaInicial;

public class App {

	public static void main(String[] args) throws IOException {
		Conexao.getConnection();
		new TelaInicial();

	}
}
