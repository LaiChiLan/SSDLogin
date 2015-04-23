package test;

import dao.*;
import util.*;
import entity.*;
 

public abstract class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     String results;
	 //	WeiXinDAOOrclImpl wximpl = new WeiXinDAOOrclImpl();
    // results = wximpl.getUserLogin("lizhinan", "1234");
     SSDLogin ssdLogin = new SSDLogin();
     results = ssdLogin.getEKPUserFullName("lizhinan", "1234");
    // results =   wximpl.setUserOpenID("0015","»ÆÎÀ¹ú","text1");
	//	results = wximpl.getUserInfo("0015", "8888");
	//	results = wximpl.getJianPinInfo("test3");
	//	results = wximpl.getJianPinInfo("test1");
	//	results = wximpl.getIsExistOpenID("o-yTojqj_Kcxj6z_YLBj6OTJTO1A");
	//	results = wximpl.getIsExistOpenID("test2");
		
		System.out.println(results);
		
		
	}

}
