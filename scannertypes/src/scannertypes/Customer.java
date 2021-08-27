package scannertypes;

public class Customer {
private int id;
private String name,emailid;
private long phoneno;
public Customer(int id, String name, String emailid, long phoneno) {
	super();
	this.id = id;
	this.name = name;
	this.emailid = emailid;
	this.phoneno = phoneno;
}

 //public void showcustomer() {
//	System.out.println(id+"\t"+name+"\t"+emailid+"\t"+phoneno);
//}

//override to String() of object class

public String toString() {
	return id+"\t"+name+"\t"+emailid+"\t"+phoneno;
}
}
