 package com.mycompany.library.entity;
//persistance layer

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.library.entity.Book;
import com.mycompany.library.entity.DbConnector;
@SuppressWarnings("unused")
public class BookDAO {
	//JDBC API classes for data retrieval
	
	private Connection connection=null;
	private PreparedStatement pstatement=null;
	private ResultSet resultset=null;
	
	//book book = new book()
	
	ArrayList<Book>booklist=null;
	
	private static String bookQry="select * from book";
	
	public ArrayList<Book>getBooks() throws ClassNotFoundException,SQLException{
		
		try {
			//open the connection
			connection= DbConnector.createConnection();
			
			//create pstatement 
			pstatement=connection.prepareStatement(bookQry);
			//get the result
			resultset =pstatement.executeQuery();
			Book book;
			booklist= new ArrayList<Book>();
			
			while(resultset.next()) {
				int bookid;
				String bookName;
				String author;
				float price;
				//declare the  pojo
				book=new Book();
				//get the row details
				bookid=resultset.getInt(1);
				bookName=resultset.getString(2);
				author=resultset.getString(3);
				price=resultset.getFloat(4);
				//set the pojo with retrived values from the row
				book.setBookid(bookid);
				book.setBname(bookName);
				book.setAuthor(author);
				book.setPrice(price);
				//add the book to booklist
				booklist.add(book);
				
				book=null;
				//end of while loop
				//DbConnector.closeConnection();
			}
		}catch(SQLException sqle) {
			
		}finally {
			//close connection
			// now data is in arraylist object, no need to keep the connection opened
			DbConnector.closeConnection();
		}
		return booklist;
		
	}

	/***********show list of books*************************/
	
	public void showBookList(ArrayList<Book>bookList2) {
		
		for(Book book:bookList2) {
			System.out.println(book.getBookid());
			System.out.println(book.getBname());
			System.out.println(book.getAuthor());
			System.out.println(book.getPrice());
			
		}
	}
	
	/*******************inserting book details **************/
	public void insertBookDetails(Book book)throws ClassNotFoundException,SQLException{
		connection =DbConnector.createConnection();
		
		String insQry="insert into book values(?,?,?,?)";
		pstatement=connection.prepareStatement(insQry);
		
		pstatement.setInt(1, book.getBookid());
		pstatement.setString(2,book.getBname());
		pstatement.setString(3,book.getAuthor());
		pstatement.setFloat(4,book.getPrice());
		
		int rows=pstatement.executeUpdate();
		System.out.println(rows+"Rows inserted");
		DbConnector.closeConnection();
	}
	/*******************Deleting book Details 
	 @throws SQLEXception
	 @throws ClassNotFound ***************/
	
	public void deleteBook(int id)throws SQLException,ClassNotFoundException{
		pstatement =null;
		Scanner sc=new Scanner(System.in);
		connection=DbConnector.createConnection();
		String delQry="delete from book where id=?";
		pstatement=connection.prepareStatement(delQry);
		
		pstatement.setInt(1, id);
		System.out.println("do you really want to delete the book!- true/false");
		boolean isDelete=sc.nextBoolean();
		
          if(isDelete) {
        	  int rows=pstatement.executeUpdate();
        	  System.out.println(rows+"rows has been deleted");
          }
          DbConnector.closeConnection();
	}
	/***********updating book details***************/
	public void updateBook(int id) throws SQLException,ClassNotFoundException{
		pstatement=null;
		float price=0.0f;
		Scanner sc=new Scanner(System.in);
		connection=DbConnector.createConnection();
		String priceQry="select price from book where id=?";
		pstatement=connection.prepareStatement(priceQry);
		pstatement.setInt(1, id);
		ResultSet rs=pstatement.executeQuery();
		while(rs.next()) {
			price=rs.getFloat("price");
		}
		System.out.println("price of the book is "+price);
		float updatePrice=price+price*0.10f;
		String updPriceQry="update book set price ="+updatePrice+"where id=?";
		pstatement=null;
		pstatement=connection.prepareStatement(updPriceQry);
		pstatement.setInt(1, id);
		pstatement.executeUpdate();
		System.out.println("price of book has been updated");
		DbConnector.closeConnection();
		
	}
}
