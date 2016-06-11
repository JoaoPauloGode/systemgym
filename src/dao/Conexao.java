package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Conexao{
	static Connection con;
  
  
	public static Connection getConnection() {
		try{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/academia";
				con = DriverManager.getConnection(url,"root","joaopaulo18");
				System.out.println("Conexao efetuada com sucesso");
				return con;
		}
		catch(Exception e){
			System.out.println("Erro ao abrir conexao com banco:");
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeAll(){
		try{
			con.close();
			System.out.println("Conexao finalizada com sucesso");
		}
		catch(Exception e){
			System.out.println("Erro ao fechar conexao com banco" + e.getMessage());
		}
	}
}