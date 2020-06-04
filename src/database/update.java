package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
    static final String database = "jdbc:mysql://localhost:3306/java?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String kull = "root";
    static final String sif = "";
	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			System.out.println("Veritabanina baglaniliyor");
            
			conn = DriverManager.getConnection(database, kull, sif);
            
			System.out.println("Baglanti basarili");
           
			String sql = "update kullanýcýlar set ad='Volkan' WHERE tc = 1";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
		    
			stmt = conn.prepareStatement(sql);
			
			stmt.executeUpdate();
			
			System.out.println("Kayýt Güncellendi");
			
			conn.close();
			
			}catch(Exception e){
        System.err.println(e);
    }
  }
}
