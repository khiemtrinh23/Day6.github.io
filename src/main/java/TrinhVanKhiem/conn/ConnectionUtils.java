package TrinhVanKhiem.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMSSQLConnection() throws SQLException, ClassNotFoundException {
			String hostName = "localhost";
			String sqlInstanceName = "DESKTOP-43J87RU";
			String dbName = "Lab04JspServletJDBC";
			String userName = "sa";
			String pasword = "12345";
			
Class.forName("com.microsoft.sqlsever.jdbc.SQLServerDiriver");
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433;instance=" + sqlInstanceName + ";databaseName=" +dbName + ";encrypt=true;trutServerCertificate=true";
		Connection conn = 
DriverManager.getConnection(connectionURL, userName, pasword);
		return conn;
	}
	
	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}
}

