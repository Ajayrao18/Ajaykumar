package scannertypes;

import java.util.Scanner;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int id;
       String name,emailid;
       long phoneno;
       System.out.println("enter customer id");
       id=sc.nextInt();
       sc.nextLine();
       System.out.println("enter customer name");
       name=sc.nextLine();//to accept multiple words
       System.out.println("enter customer emailid");
       emailid=sc.nextLine();
       System.out.println("enter customer phoneno");
       phoneno=sc.nextLong();
       //create object of customer
       
     Customer lasya=new Customer(id,name,emailid,phoneno);
     ;
     
     System.out.println(lasya);
	}

}
