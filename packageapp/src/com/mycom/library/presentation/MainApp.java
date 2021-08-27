package com.mycom.library.presentation;

import com.mycom.library.model.Book;
import com.mycom.library.model.Member;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Book book=new Book(1001,"charles babbage","fred weasly",435.5f);
    book.showBokdetails();
    //System.out.println(book.name);
    
    Member member = new Member(1223,"dff");
    member.showbookname();
	}

}
