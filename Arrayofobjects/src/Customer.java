
public class Customer {
int id;
String name;
long phoneno;
String emailid;
Customer(int id,String name,long phoneno,String emailid){
	this.id=id;
	this.name=name;
	this.phoneno=phoneno;
	this.emailid=emailid;
}

public void showDetails() {
	System.out.println("id"+id+"\tname"+name+"\tPhoneNo"+phoneno+"\temailid"+emailid);
}
}
