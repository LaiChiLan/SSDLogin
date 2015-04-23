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

@javax.jws.WebService(targetNamespace = "http://dao/", serviceName = "SSDLoginService", portName = "SSDLoginPort", wsdlLocation = "WEB-INF/wsdl/SSDLoginService.wsdl")
public class SSDLoginDelegate {

	dao.SSDLogin sSDLogin = new dao.SSDLogin();

	public String getEKPUserFullName(String rasclientid, String passwd)
			throws Exception {
		return sSDLogin.getEKPUserFullName(rasclientid, passwd);
	}

}