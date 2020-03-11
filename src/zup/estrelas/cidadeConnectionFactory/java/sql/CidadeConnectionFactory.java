package zup.estrelas.cidadeConnectionFactory.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class CidadeConnectionFactory {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/estrelas?user=root"
							+ "&password=root&useTimezone=true&serverTimezone=UTC");
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
