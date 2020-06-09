/**
 * Designed By : Varun
 * Class Name : Application DB Query
 * Usage : Read data from DB
 */
package com.evonsys.citi.util.dataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplicationDBQuery {
	public int getEmpSalary(String dbQuery) throws SQLException{
		ResultSet result = DataBaseUtil.getResultSet(dbQuery);
		while(result.next()){
			//int salary = result.getString(columnIndex);
		}
		return 0;
	}

}
