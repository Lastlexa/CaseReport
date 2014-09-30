package db;

import java.sql.ResultSet;
import java.sql.Statement;

abstract public class AbstractDictGateway {

	public static final ResultSet findDict(String query){
		ResultSet rs;
		try {
			Statement st = DB.connection.createStatement();
			rs = st.executeQuery(query);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return rs;
	}

}
