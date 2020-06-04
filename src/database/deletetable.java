package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class deletetable {

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
				
				stmt = conn.createStatement();
				
				String sql = "DROP TABLE personel ";
				 
			    stmt.executeUpdate(sql);
				
				System.out.println("Tablo silme baþarýlý");
				
	}catch(Exception e){
        System.err.println(e);
    }

	}

}
