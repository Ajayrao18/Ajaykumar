package bankproject;

public class Bankdetails {
int acNo;
String name;
float balance;

Bankdetails() {
	acNo=007;
	name="Ajay";
	balance=5000.0f;
}
public void showdetails() {
    
	System.out.println("acno:"+ acNo);
	System.out.println("name:"+ name);
	System.out.println("balance:"+ balance);
	
	}
	
	

}
