package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	static final String database = "jdbc:mysql://localhost:3306/java?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String kull = "root";
    static final String sif = "";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
try {
			
			System.out.println("Veritabanina baglaniliyor");
            
			conn = DriverManager.getConnection(database, kull, sif);
            
			System.out.println("Baglanti basarili");
           
			System.out.println("Tablo Oluþturuluyor");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE personel " +
		                   "(id INTEGER not NULL, " +
		                   " Ad VARCHAR(30), " + 
		                   " Soyad VARCHAR(30), " + 
		                   " yaþ INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Tablo Oluþturuldu.");
			
			
			}catch(Exception e){
        System.err.println(e);
    }
	}

}
