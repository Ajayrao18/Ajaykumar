 package polymorphism;

public class BankAccount {
 int acno;
 String actype;
 float balance;
 //overloading constructor
 
 BankAccount(){
	 acno=512345;
	 actype="savingd bank Account";
     balance=500000.00f;			 
 }
 
 BankAccount(float balance){ //one argument constructor
	 
	 this.balance=balance;
	 
 }
 
 BankAccount(String actype,float balance){ //two argument constructor
	 this.actype=actype;
	 this.balance=balance;
 }
 
 public void showAccountdetails() {
	 System.out.println(acno+"\t"+actype+"\t"+balance);
 }
}
