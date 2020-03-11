package zup.estrelas.cidade.java.sql;

import java.sql.Connection;
import java.sql.SQLException;

import zup.estrelas.cidadeConnectionFactory.java.sql.CidadeConnectionFactory;

public class CidadePrincipal {

	public static void main(String[] args) throws SQLException{
			
			Connection conn = new CidadeConnectionFactory().getConnection();
			
			System.out.println("Connectado!");
			conn.close();
			
			
					
	}

}
