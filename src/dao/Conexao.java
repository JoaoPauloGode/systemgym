package dao;
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
 
public class Conexao {
	public static Connection con;
  
	public static Connection getConnection() throws IOException {
		try{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/academia";
				con = DriverManager.getConnection(url,"root","");
				System.out.println("Conexao efetuada com sucesso");
				return con;
		}
		catch(Exception e){
			System.out.println("Erro ao abrir conexao com banco:");
			int escolha=JOptionPane.showConfirmDialog(null, "Caro usuário, inicialize o xampp!");
			if(escolha==JOptionPane.YES_OPTION) {
				Runtime.getRuntime().exec("C:\\xampp\\xampp_start");
				JOptionPane.showMessageDialog(null, "Inicie a aplicação novamente para que funcione corretamente");
			} else if(escolha==JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Caro usuário, o programa não funcionará corretamente,\n inicialize o xampp!!!"
						+ " e reinicie a aplicação");
			} else if(escolha==JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Caro usuário, o programa não funcionará corretamente,\n inicialize o xampp!!!"
						+ " e reinicie a aplicação");
			}
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeAll() {
		try{
			con.close();
			System.out.println("Conexao finalizada com sucesso");
		}
		catch(Exception e){
			System.out.println("Erro ao fechar conexao com banco" + e.getMessage());
		}
	}
}