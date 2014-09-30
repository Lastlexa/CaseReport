package db;

import java.sql.ResultSet;

public class OperationDictGateway extends AbstractDictGateway {
	
	private static final String query = "SELECT operation_id, code, name FROM V_Operation";

	public static final ResultSet findDict(){
		return findDict(query);
	}
}
