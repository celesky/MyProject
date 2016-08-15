package com.proxy.staticproxy.proxy;

import com.proxy.staticproxy.BookFacade;

public class BookProxy implements BookFacade{
	private BookFacade bookFacade;  
	
	public BookProxy(BookFacade bookFacade){
		this.bookFacade = bookFacade;
	}
	
	
	@Override
	public void addBook() {
		 System.out.println("������֮ǰ");  
	        // ����ί����ķ���;  
		 bookFacade.addBook();
		 
	     System.out.println("������֮��");  
	}

}
