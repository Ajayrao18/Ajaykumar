package com.mycompany.library.service;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mycompany.library.dao.BookDAO;
import com.mycompany.library.entity.Book;
import com.mycompany.library.entity.BookDAO;
public class BookServiceProvider {

	ArrayList<Book>booklist=new ArrayList<Book>();
	BookDAO bookDAO =new BookDAO();
	
	//reading book data service 
	public ArrayList<Book>getBookService()throws ClassNotFoundException,SQLException{
		booklist = bookDAO.getBooks();
		return booklist;
	}
	//showing book data service
	public void showBookService(ArrayList<Book>booklist) throws ClassNotFoundException,SQLException{
		booklist=bookDAO.getBooks();
		bookDAO.showBookList(booklist);
		
	}
	//inserting book data service
	public void insertBookService(Book book)throws ClassNotFoundException,SQLException{
		bookDAO.insertBookDetails(book);
	}
	//deleting book data service
	public void deleteBookService(int id)throws ClassNotFoundException,SQLException{
		bookDAO.deleteBook(id);
	}
	public void updateBookService(int id)throws ClassNotFoundException,SQLException{
		bookDAO.updateBook(id);
	}
}
