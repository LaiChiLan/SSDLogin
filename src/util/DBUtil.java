package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

  public static Connection getConnection() throws Exception{	
	  Connection conn = null;
	  // 	String url="jdbc:oracle:thin:@192.168.10.201:1521:gdidcoa";
	  // 	String userName = "ekp";
	//  	String userPass = "gdidcoa";
	    	String url="jdbc:oracle:thin:@219.137.165.219:1521:orcl";
	    	String userName = "gdidc_dict";
	     	String userPass = "limssuper";
	    	try {
	    	Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,userName,userPass); 
			System.out.println("	���ӳɹ�	"); 
	    	} catch (Exception e) {
	    		e.printStackTrace(); 
	    		throw e;
	    	}      	 
	    	return conn;
		  
  }
  
  public static void close(Connection conn) throws Exception {
	  if(conn!= null){
		  try{
			  conn.close();	  
		  }catch(SQLException e){
			  e.printStackTrace(); 
			  throw e;
		  }
		  
	  }  
  }
}
