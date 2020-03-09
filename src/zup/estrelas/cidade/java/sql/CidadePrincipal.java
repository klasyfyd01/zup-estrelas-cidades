package zup.estrelas.cidade.java.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class CidadePrincipal {

	public static void main(String[] args) throws SQLException{
			
			Connection conn = new CidadeConnFactory().getConnection();
			
			System.out.println("Connectado!");
			conn.close();
			
			
					
	}

}
