package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String url_db="jdbc:mysql://localhost:3306/cadastro?useTimezone=true&serverTimezone=UTC";
	public Connection getDbCon() {
		
		try {
			
			return DriverManager.getConnection(url_db,"root","M&qix4v9");
			
			}catch(SQLException e){
				
				throw new RuntimeException();
				
			}
		}
}
