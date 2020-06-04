package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {
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
			
			System.out.println("Kayitlar tabloya eklenecek");
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO kullanýcýlar " +  "VALUES (3, 'Selçuk', 'Korkmaz', 532006652)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO kullanýcýlar " + "VALUES (4, 'Mehmet', 'Yavas', 532006653)";
            stmt.executeUpdate(sql);
            System.out.println("Kayit ekleme basarili");
           
			}catch(Exception e){
        System.err.println(e);
    }
  }
}
