package db;

import java.sql.ResultSet;

public class DiagnosisDictGateway extends AbstractDictGateway {
	
    private static final String query = "SELECT diagnosis_id, code, name FROM V_Diagnosis";

    public static final ResultSet findDict(){
	return findDict(query);
    }
}
