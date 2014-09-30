package db;

import java.sql.Connection;
import java.sql.DriverManager;
	
public final class DB {
	// параметры базы данных
	private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver"
	    , dsn = "jdbc:derby:crdb"
            , uid = ""
            , pwd = "";
	public static Connection connection = null;
	public static void runDB() {
		// инициализация JDBC
		try {
                    Class.forName(driver);
                    // объект-соединение с базой данных
                    connection = DriverManager.getConnection(dsn, uid, pwd);
		} catch (Exception e) {
                    throw new RuntimeException(e);
		}
	}
}

