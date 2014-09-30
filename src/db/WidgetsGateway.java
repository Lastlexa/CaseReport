package db;

import java.sql.ResultSet;

public class WidgetsGateway extends AbstractDictGateway {
	
	private static final String query = "SELECT class_name, name, panel, position, comment FROM V_Test_Widget";

	public static final ResultSet findDict(){
		return findDict(query);
	}
}
