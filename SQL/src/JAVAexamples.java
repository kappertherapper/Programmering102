
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JAVAexamples {

	/**
	 * @param args
	 */
	static Connection minConnection;
	static Statement stmt;
	static BufferedReader inLine;


	/** SELECT uden parm */
	public static void selectudenparm() {
	try {
		// Laver sql-sætning og får den udført
		String sql = "select init, aarstal, plac from placering"; // ændres her brormand
		System.out.println("SQL-streng er "+sql);
		ResultSet res=stmt.executeQuery(sql);

		// gennemløber svaret
		while (res.next()) {
			String s;
			s = res.getString("init");
			System.out.println(s + "    " + res.getString(2));
		}

		// pæn lukning
 		if (!minConnection.isClosed()) minConnection.close();
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	}

	/** SELECT med parm */
	public static void selectmedparm() {
	try {
		// Indlæser søgestreng
		System.out.println("Indtast søgestreng");
		String inString = inLine.readLine();

		// Laver sql-sætning og får den udført
		String sql = "select init, aarstal from placering where init like '" + inString + "%'";// ændre her g
		System.out.println("SQL-streng er "+ sql);
		ResultSet res=stmt.executeQuery(sql);

		//gennemløber svaret
		while (res.next()) {
			System.out.println(res.getString(1) + "    " + res.getString(2));
		}

		// pæn lukning
 		if (!minConnection.isClosed()) minConnection.close();
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	}

	/** INSERT med string */
	public static void insertmedstring() {
		try {
			// indlæsning
			System.out.println("Vi vil nu oprette et nyt ansættelsesfforhold");
			System.out.println("Indtast cpr (personen skal være oprettet på forhånd");
			String cprstr=inLine.readLine();
			System.out.println("Indtast firmanr (firma skal være oprettet på forhånd");
			String firmastr=inLine.readLine();
		
			// sender insert'en til db-serveren
			String sql = "insert into ansati values ('" + cprstr + "'," + firmastr + ")";
			System.out.println("SQL-streng er "+ sql);
			stmt.execute(sql);

			// pænt svar til brugeren
			System.out.println("Ansættelsen er nu registreret");
			if (!minConnection.isClosed()) minConnection.close();
		}
		catch (SQLException e) {
			        switch (e.getErrorCode())
			        // fejl-kode 547 svarer til en foreign key fejl
			        { case 547 : {if (e.getMessage().contains("cprforeign"))
										System.out.println("cpr-nummer er ikke oprettet");
			        			  else
			        			  if (e.getMessage().contains("firmaforeign"))
										System.out.println("firmaet er ikke oprettet");
			        			  else
			        				    System.out.println("ukendt fremmednøglefejl");
								  break;
			        			}
			        // fejl-kode 2627 svarer til primary key fejl
			          case 2627: {System.out.println("den pågældende ansættelse er allerede oprettet");
			          	          break;
			         			 }
			          default: System.out.println("fejlSQL:  "+e.getMessage());
				};
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	};

	/** INSERT prepared? */
	public static void insertprepared() {
		try {
			// indlæsning
			System.out.println("Vi vil nu oprette et nyt ansættelsesforhold");
			System.out.println("Indtast cpr (personen skal være oprettet på forhånd");
			String cprstr=inLine.readLine();
			System.out.println("Indtast firmanr (firma skal være oprettet på forhånd");
			String firmastr=inLine.readLine();

			// Anvendelse af prepared statement
			String sql = "insert into ansati values (?,?)";
			PreparedStatement prestmt = minConnection.prepareStatement(sql);
			prestmt.clearParameters();
			prestmt.setString(1,cprstr);
			prestmt.setInt(2,Integer.parseInt(firmastr));

			// Udfører sætningen
			prestmt.execute();
			// p�nt svar til brugeren
			System.out.println("Ansættelsen er nu registreret");
			if (!minConnection.isClosed()) minConnection.close();
		}
		catch (SQLException e) {
			        switch (e.getErrorCode())
			        // fejl-kode 547 svarer til en foreign key fejl
			        { case 547 : {if (e.getMessage().contains("cprforeign"))
									  System.out.println("cpr-nummer er ikke oprettet");
			        			  else	
			        			  if (e.getMessage().contains("firmaforeign"))
						              System.out.println("firmaet er ikke oprettet");
			        			  else
			        				  System.out.println("ukendt fremmednøglefejl");
								  break;
			        			}
			        // fejl-kode 2627 svarer til primary key fejl
			          case 2627: {System.out.println("den pågældende ansættelse er allerede oprettet");
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
			//generel opsætning
			//via native driver
			String server="localhost"; //virker måske hos dig
			                                       //virker det ikke - prøv kun med localhost
			String dbnavn="cykelscript";            //virker måske hos dig
			String login="sa";                     //skal ikke ændres
			String password="Camel13975";            //skal ændres
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			minConnection = DriverManager.getConnection("jdbc:sqlserver://"+server+";databaseName="+dbnavn+
					";user=" + login + ";password=" + password + ";");
			//minConnection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=eksempeldb;user=sa;password=Camel13975 -e MSSQL_PID=personal’;");
			stmt = minConnection.createStatement();
			//Indlæsning og kald af den rigtige metode
			System.out.println("Indtast  "); 
			System.out.println("s for select uden parameter  ");
			System.out.println("sp for select med parameter  ");
			System.out.println("i for insert med strengmanipulation");
			System.out.println("ps for insert med prepared statement ");
			String in=inLine.readLine();
			switch (in)
			{case "s"  : {selectudenparm();break;}
			 case "sp" : {selectmedparmUdgået();break;}
			 case "i"  : {insertmedstring();break;}
			 case "ps"  : {insertprepared();break;}
			default : System.out.println("ukendt indtastning"); 
			} 
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	}


	// forsøg
	public static void selectmedparmUdgået() {
		try {
			// Indlæser søgestreng
			System.out.println("Indtast søgestreng");
			String inString = inLine.readLine();

			// Laver sql-sætning og får den udført
			String sql = "select init, aarstal, plac from placering where init like '" + inString + "%'"; // ændre her g
			System.out.println("SQL-streng er "+ sql);
			ResultSet res = stmt.executeQuery(sql);

			//gennemløber svaret
			while (res.next()) {
				System.out.println(res.getString(1) + "    " + res.getString(2));
			}

			// pæn lukning
			if (!minConnection.isClosed())
				minConnection.close();
		}
		catch (Exception e) {
			System.out.println("fejl:  "+e.getMessage());
		}
	}
	

}

