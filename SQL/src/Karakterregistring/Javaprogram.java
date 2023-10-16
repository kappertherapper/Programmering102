package Karakterregistring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Javaprogram {
	static Connection minConnection;
	static Statement stmt;
	static BufferedReader inLine;


	/** INSERT med string */
	public static void insertEksamenafholdelse() {
		try {
			// indlæsning
			System.out.println("Vi vil nu oprette et nyt eksamensafholdelse");

			System.out.println("Indtast termin");
			String terminstr = inLine.readLine();

			System.out.println("Indtast start dato (som så: 2024.08.01)");
			String startDatostr = inLine.readLine();

			System.out.println("Indtast slut dato (som så: 2024.08.02)");
			String slutDatostr = inLine.readLine();

			System.out.println("Indtast hvilken eksamen (eksamen er oprettet på forhånd)");
			String eksamenstr = inLine.readLine();

			String ea_id = "12";
			String erStopTest = "0";
		
			// INSERT til db-serveren
			String sql = "INSERT INTO Eksamensafholdelse (ea_id, termin, startDato, slutDato, erStopTest, fk_eksamenNavn) VALUES " +
					"('" + ea_id + "','" + terminstr + "','" + startDatostr + "','" + slutDatostr + "','" + erStopTest + "','" + eksamenstr + "')";
			System.out.println("SQL-streng er "+ sql);
			stmt.execute(sql);

			System.out.println("Eksamensafholdelsen er nu registreret");
			if (!minConnection.isClosed()) minConnection.close();

		}
		catch (SQLException e) {
			        switch (e.getErrorCode())

			        // fejl-kode 547 = foreign key fejl
			        { case 547 : {if (e.getMessage().contains("navn"))
										System.out.println("FEJL: den indtastede eksamen er ikke oprettet");

			        			 	 else
			        				    System.out.println("FEJL: ukendt fremmednøglefejl");
								  break;
			        			}

			        // fejl-kode 2627 = primary key fejl
			          case 2627: {System.out.println("FEJL: Den pågældende eksamenafholdelse er allerede oprettet");
			          	          break;
			         			 }
			          default: System.out.println("fejlSQL:  "+e.getMessage());
				};
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	};
	
	public static void main(String[] args) {
		try {
			inLine = new BufferedReader(new InputStreamReader(System.in));
			//generel opsætning, via native driver

			String server = "localhost";
			String dbnavn = "Karakterregistrering DB";
			String login = "sa";
			String password = "Camel13975";

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			minConnection = DriverManager.getConnection("jdbc:sqlserver://" + server + ";databaseName=" + dbnavn +
					";user=" + login + ";password=" + password + ";");
			stmt = minConnection.createStatement();

			//Indlæsning og kald af den rigtige metode
			System.out.println("Indtast  "); 
			//System.out.println("s for select uden parameter  ");
			//System.out.println("sp for select med parameter  ");
			System.out.println("i for insert med Eksamenafholdelse");
			//System.out.println("ps for insert med prepared statement ");
			String in=inLine.readLine();

			switch (in)
			{//case "s"  : {selectudenparm();break;}
			 //case "sp" : {selectmedparm();break;}
			 case "i"  : {insertEksamenafholdelse();break;}
			 //case "ps"  : {insertprepared();break;}
			default : System.out.println("ukendt indtastning"); 
			} 
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	}
}

