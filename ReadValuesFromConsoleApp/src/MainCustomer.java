import java.util.Scanner;
public class MainCustomer {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);//system.in -> keyboard
		System.out.println("enter customer id");
		int id=scnr.nextInt();
		System.out.println("em=nter customer name");
		String name=scnr.next();
		System.out.println("enter customer phoneno");
		long phoneno=scnr.nextLong();
		System.out.println("enter customer emailid");
		String emailid=scnr.next();
		
		Customer ram=new Customer(id,name,phoneno,emailid);
		ram.showdetails();
		
		//read values for shyam
		System.out.println("enter customer id");
		id=scnr.nextInt();
		System.out.println("em=nter customer name");
	    name=scnr.next();
		System.out.println("enter customer phoneno");
	    phoneno=scnr.nextLong();
		System.out.println("enter customer emailid");
		emailid=scnr.next();
		Customer syam=new Customer(id,name,phoneno,emailid);
		syam.showdetails();
	}

}
