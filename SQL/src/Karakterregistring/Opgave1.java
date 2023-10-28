package Karakterregistring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Opgave1 {
    static Connection minConnection;
    static Statement stmt;
    static BufferedReader inLine;

    public static void main(String[] args) {
        try {
            inLine = new BufferedReader(new InputStreamReader(System.in));
            //generel opsætning
            //via native driver
            String server="localhost"; //virker måske hos dig
            //virker det ikke - prøv kun med localhost
            String dbnavn="DAOSProjekt";            //virker måske hos dig
            String login="sa";                     //skal ikke ændres
            String password="Hejmeddig123";            //skal ændres
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            minConnection = DriverManager.getConnection("jdbc:sqlserver://"+server+";databaseName="+dbnavn+
                    ";user=" + login + ";password=" + password + ";");
            //minConnection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=eksempeldb;user=sa;password=torben07;");
            stmt = minConnection.createStatement();
            //Indlæsning og kald af den rigtige metode

            System.out.println("Indtast  ");
            System.out.println("a for at oprette eksamensforsøg ");
            System.out.println("b for at insert eksamensafholdelse");
            System.out.println("c for at select en eksamen og termin");
            String in=inLine.readLine();
            switch (in)
            {case "a"  : {opretEksamensForsøg();break;}
                case "b" : {insertEksamenafholdelse();break;}
                case "c"  : {selectEksamenmedparm();break;}
                default : System.out.println("ukendt indtastning");
            }
        }
        catch (Exception e) {
            System.out.println("fejl:  "+e.getMessage());
        }
    }

    public static void opretEksamensForsøg() {
        try {
            // indlæsning
            System.out.println("Vi vil nu oprette et nyt Eksamensforsøg");
            System.out.println("Indtast EksamensforsøgID");
            String efID=inLine.readLine();
            System.out.println("Indtast Karaktr");
            String karakter=inLine.readLine();
            System.out.println("Indtast EksamensStatus(NULL, SY, IM, IA)");
            String status = inLine.readLine();
            System.out.println("Indtast forsøgs nr");
            String forsøgnr = inLine.readLine();
            System.out.println("indtast studentID");
            String stuID = inLine.readLine();
            System.out.println("Indtast Eksamensafholelses id");
            String eaID = inLine.readLine();


            // sender insert'en til db-serveren
            String sql = "insert into EksamensForsøg values(" + efID + "," + karakter + "," + status +
                    "," + forsøgnr + "," + stuID + "," + eaID +")";
            System.out.println("SQL-streng er "+ sql);
            stmt.execute(sql);
            // pænt svar til brugeren
            System.out.println("Eksamensforsøget er nu registreret");
            if (!minConnection.isClosed()) minConnection.close();
        }
        catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            { case 547 : {if (e.getMessage().contains("studentID"))
                System.out.println("Studenten er ikke oprettet");
            else
            if (e.getMessage().contains("eksamensafholdelseID"))
                System.out.println("eksamensafholdelsen er ikke oprettet");
            else
                System.out.println("ukendt fremmednøglefejl");
                break;
            }
            // fejl-kode 2627 svarer til primary key fejl
                case 2627: {System.out.println("det pågældende Eksamensforsøg er allerede oprettet");
                    break;
                }
                default: System.out.println("fejlSQL:  "+e.getMessage());
            };
        }
        catch (Exception e) {
            System.out.println("fejl:  "+e.getMessage());
        }
    };

    public static void insertEksamenafholdelse() {
        try {
            // indlæsning
            System.out.println("Vi vil nu oprette et nyt eksamensafholdelse");
            System.out.println("Indtast eksamensafholdesesID");
            String eksamensID = inLine.readLine();

            System.out.println("Indtast termin");
            String terminstr = inLine.readLine();

            System.out.println("Indtast start dato (som så: 2024.08.01)");
            String startDatostr = inLine.readLine();

            System.out.println("Indtast slut dato (som så: 2024.08.02)");
            String slutDatostr = inLine.readLine();

            System.out.println("Indtast hvilken eksamen (eksamen skal være oprettet på forhånd)");
            String eksamenstr = inLine.readLine();

            String erStopTest = "0";

            // INSERT til db-serveren
            String sql = "INSERT INTO Eksamensafholdelse (eksamensafholdelseID, termin, startDato, slutDato, erStopTest, fk_eksamensNavn) VALUES " +
                    "('" + eksamensID + "','" + terminstr + "','" + startDatostr + "','" + slutDatostr + "','" + erStopTest + "','" + eksamenstr + "')";
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

    public static void selectEksamenmedparm() {
        try {
            // Indlæser søgestreng
            System.out.println("Indtast termin");
            String terminString = inLine.readLine();
            System.out.println("Indtast navn på eksamen");
            String eksamenString = inLine.readLine();
            // Laver sql-sætning og får den udført
            String sql = "select student.navn, student.studentID, eksamensforsøg.karakter, eksamen.navn\n" +
                    "from uddannelse\n" +
                    "join eksamen on eksamen.fk_uddannelsesnavn = uddannelse.uddannelsesnavn\n" +
                    "join eksamensafholdelse on eksamensafholdelse.fk_eksamensNavn = eksamen.navn\n" +
                    "join student on student.fk_uddannelsesNavn = uddannelse.uddannelsesnavn\n" +
                    "join eksamensforsøg on eksamensforsøg.fk_studentID = student.studentID and eksamensforsøg.fk_eksamensafholdeseID = eksamensafholdelseID\n" +
                    "where eksamensafholdelse.termin like '" + terminString + "' and eksamen.navn like '" + eksamenString + "'";


            System.out.print("Navn                       StudentID");
            System.out.println("  Karakter");
            System.out.println("_____________________________________________");
            ResultSet res=stmt.executeQuery(sql);
            //gennemløber svaret
            while (res.next()) {
                System.out.println(res.getString(1) + "    " + res.getString(2) + "     " + res.getString(3));
            }
            // pæn lukning
            if (!minConnection.isClosed()) minConnection.close();
        }
        catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            { case 547 : {if (e.getMessage().contains("termin"))
                System.out.println("Termin ikke oprettet");
            else
            if (e.getMessage().contains("eksamen"))
                System.out.println("Eksamen er ikke oprettet");
            else
                System.out.println("ukendt fremmednøglefejl");
                break;
            }
            // fejl-kode 2627 svarer til primary key fejl
                case 2627: {System.out.println("det pågældende resultat er allerede oprettet");
                    break;
                }
                default: System.out.println("fejlSQL:  "+e.getMessage());
            };
        }
        catch (Exception e) {
            System.out.println("fejl:  "+e.getMessage());
        }
    };
}
