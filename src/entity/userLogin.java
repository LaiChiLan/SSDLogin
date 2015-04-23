package entity;

public class userLogin {
   String	fullname;

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}
   

@Override
public String toString() {
	/*String str = "";
	str += "<userinfo>";
	str += "<fullname><![CDATA["+ fullname + "]]></fullname>";
	str += "</userinfo>";*/
	
	String str = "";
	str +=  fullname  ;
	return str;
}
}
