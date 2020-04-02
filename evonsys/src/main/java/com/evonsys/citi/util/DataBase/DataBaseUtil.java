package com.evonsys.citi.util.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.evonsys.citi.util.logger.LoggerUtil;

public class DataBaseUtil {

	private static Logger log = LoggerUtil.getLogger(DataBaseUtil.class);
	private static String url="jdbc:mysql://localhost/person";
	private static String username="root";
	private static String password="password";
	private static Connection connection;
	private static String driverName="com.mysql.jdbc.Driver";
	private static DataBaseUtil instance;
	
	public DataBaseUtil(){
		connection = getInstanceConnection();
	}
	
	public static DataBaseUtil getInstance(){
		if(instance==null){
			instance = new DataBaseUtil();
		}
		return instance;
	}
	
	private Connection getInstanceConnection(){
		try{
			Class.forName(driverName);
			try{
				connection = DriverManager.getConnection(url, username, password);
				if(connection!=null){
					log.info("Connected to Data Base");
				}
			}catch(SQLException e){
				log.error("Failed to create Data Base Connection :" +e);
			}
		}catch(ClassNotFoundException e){
			log.info("Driver not found.. "+e);
		}
		return connection;
	}
	
	public Connection getConnection(){
		return connection;
	}
	
	public static ResultSet getResultSet(String dbQuery){
		instance = DataBaseUtil.getInstance();
		connection = instance.getConnection();
		log.info("Executing Query : "+dbQuery);
		try{
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(dbQuery);
			return result;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
