package com.mycom.collections.sortreverse.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainUser {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		ArrayList<User> userlist=new ArrayList<User>();
		
		try {
			System.out.println("enter the number of users");
			int num=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<num;i++) {
				System.out.println("Enter the details of user - name,mobile number,city ..."+(i+1));
				String userinfo=sc.nextLine();
				String user[]=userinfo.split(",");
				userlist.add(new User(user[0],user[1],user[2]));
			}
			Collections.sort(userlist);
			System.out.println(" user details in sorted order");
			System.out.println("NAme   Mobilenumber  City");
			
			for(User user: userlist) {
		       System.out.println(user.toString());
			}
			
			Collections.reverse(userlist);
			
		
		}catch(Exception e) {
			
		}finally {
			System.out.println("user details in reverse sorted order");
			System.out.println("Name  mobilenumber  City");
			for(User user: userlist) {
			       System.out.println(user.toString());
				}
		}
		
		
		

	}

}
