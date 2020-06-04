package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class islem {
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
           
			}catch(Exception e){
        System.err.println(e);
    }
  }
}