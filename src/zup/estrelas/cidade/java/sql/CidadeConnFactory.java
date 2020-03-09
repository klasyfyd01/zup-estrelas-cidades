package zup.estrelas.cidade.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;





public class CidadeConnFactory {
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
