package com.mycompany.library.pesentation;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.library.entity.Book;
import com.mycompany.library.service.BookServiceProvider;
public class BookUi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Book book = new Book();
		ArrayList<Book>bookList=new ArrayList<Book>();
		
		BookServiceProvider bookServiceProvider=new BookServiceProvider();
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1.Add book details\n 2.show book details\n 3. delete book\n 4.updatebook\n 5.exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				book=null;
				book=new Book();
				System.out.println("Enter book id,book name,author,price");
				book.setBookid(sc.nextInt());
				sc.nextLine();
				
				book.setBname(sc.nextLine());
				book.setAuthor(sc.nextLine());
				book.setPrice(sc.nextFloat());
				sc.nextLine();
				
				bookServiceProvider.insertBookService(book);
				break;
			case 2:
				//1.get books
				bookList=bookServiceProvider.getBookService(); 
				
				
				//2.show books
				
				bookServiceProvider.showBookService(bookList);
				break;
			case 3:
				System.out.println("Enter the book id");
				int id=sc.nextInt();
				sc.nextLine();
				bookServiceProvider.deleteBookService(id);
				break;
				
			case 4:
				System.out.println("Enter the book id");
				int bid=sc.nextInt();
				sc.nextLine();
				bookServiceProvider.updateBookService(bid);
				
				break;
				
			case 5:
				System.out.println("thank you for using our application");
				System.exit(0); //to terminate the application
				break;
				
			}
			
		}

	}

}
