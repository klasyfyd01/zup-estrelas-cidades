package zup.estrelas.cidadeDAO.java.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import zup.estrelas.cidadeConnectionFactory.java.sql.CidadeConnectionFactory;



public class CidadeDAO {
	private Connection conn;

	public CidadeDAO() {
		this.conn = new CidadeConnectionFactory().getConnection();
	}

	public void insertCidade(int cep, String nome, int numeroHabitantes, boolean capital, String estado, float renda_per_capita, String data_fundacao )  {
		String sql = "insert into cidade"
				+ "(cep, nome,estado, nro_habitantes, capital,  renda_per_capita, data_fundacao)"
				+ "value(?,?,?,?,?,?,?)";

		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, cep);
			stmt.setString(2, nome);
			stmt.setString(3, estado);
			stmt.setInt(4, numeroHabitantes);
			stmt.setBoolean(5, capital);
			stmt.setFloat(6, renda_per_capita);
			stmt.setString(7, data_fundacao);
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
