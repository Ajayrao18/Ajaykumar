
public class Customer {
  int id;
  String name;
  long phoneno;
  String emailid;
  
//  Customer(int vid,String vname,long vphoneno,String vemailid)
  Customer(int id,String name,long phoneno,String emailid){
	  this.id=id;
	  this.name=name;
	  this.phoneno=phoneno;
	  this.emailid=emailid;
  }
  
  public void showdetails() {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(phoneno);
	 System.out.println(emailid);
  }
}
