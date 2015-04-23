package dao;

import util.DBUtil;
import entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;  
import javax.jws.WebService;  

import func.md5;
//@WebService(endpointInterface="dao.WeiXinDAO")

public class SSDLogin     {
 
    public String getEKPUserFullName(String rasclientid,String passwd ) throws Exception {
        //  List<WeiXin> ls_weixin = new ArrayList<WeiXin>();
      
    	//String results = "<?xml version=\"1.0\" encoding=\"utf-8\"?><xml>";
    	String md5Pas = "";
    	String results = "";
    	userLogin userLogin =new userLogin();    
    	md5 getMD5 = new md5();
    	//
    	md5Pas =  getMD5.GetMD5Code(passwd);
    
     	    String SQL = "";
     		Connection conn  = DBUtil.getConnection();

     	//	SQL = "select   el.fd_name   from sys_org_element el,sys_org_person pe "
     	// 		+ "where el.fd_id = pe.fd_id  and el.fd_name_pinyin = ? and pe.fd_password = ? ";
     		SQL = "select  tablename from  fldmaint where hypcapt = 'Comments'";
         	 System.out.println(SQL);
             PreparedStatement prep = conn.prepareStatement(SQL);  
         //    prep.setString(1, rasclientid);
        //     prep.setString(2, md5Pas);
     		try {
     			 	ResultSet rst = prep.executeQuery(); 	  	
     	        
     		     	while(rst.next()){
     		     	//	userLogin.setFullname(rst.getString("fd_name") == null ? "" : rst.getString("fd_name") ); 	
     		     		userLogin.setFullname(rst.getString("tablename") == null ? "" : rst.getString("tablename") ); 		
     		     		results += userLogin.toString();
     		    	}
     			
     		     //	results  += "</xml>";
     		    }catch(Exception e){
     		
     				e.printStackTrace();	
     		    }
     		
     	    finally{
     			DBUtil.close(conn);
     			return results;
     			}
       	
       }
    
    
 
}
