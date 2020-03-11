package zup.estrelas.cidadeMenuPrincipal.java.sql;

import java.sql.PreparedStatement;
import java.util.Scanner;

import zup.estrelas.cidadeDAO.java.sql.CidadeDAO;

/*Crie no seu programa principal menu para cadastro de cidades, que peça ao usuário todos os
dados e que no fim o insira no banco de dados, este programa deve avaliar se os dados
inseridos correspondem ao tipo pedido e tratar este comportamento.*/
public class CidadeMenuPrincpal {

	public static void main(String[] args) {
		CidadeDAO cidadeDao = new CidadeDAO();
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome user to our system !");

		int option = 0;
		do {
			System.out.println("To insert database, type 1");
			System.out.println("To search our database, type 2");
			System.out.println("To delete from the database, type 3");
			System.out.println("To exit, press 4");
			option = in.nextInt();

			switch (option) {
			case 1:
				System.out.println("Type your CEP");
				int cep = in.nextInt();
				System.out.println("Type the name of your city");
				String nome = in.next();
				System.out.println("Type the abbreviation of your state");
				String estado = in.next();
				System.out.println("Type the number of habitantes");
				int numeroHabitantes = in.nextInt();
				System.out.println("Type 0 or 1 to indicate if its a capital or not");
				boolean capital = in.nextBoolean();
				System.out.println("Please your income");
				float rendaPerCapita = in.nextFloat();
				System.out.println("Type the foundation date of your city ");
				String dataFundacao = in.next();
				cidadeDao.insertCidade(cep, nome, numeroHabitantes, capital ,estado, rendaPerCapita, dataFundacao);
				break;
			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println("Delete");
				break;
			default:
				System.out.println("Exit");
			}
		} while (option == -1);

	}

}
