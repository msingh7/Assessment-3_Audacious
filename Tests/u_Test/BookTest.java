package library.Tests.u_Test;

import static org.junit.Assert.*;



import org.junit.Test;

import library.Entities.Book;

public class BookTest {

	@Test
	public void test() {
		Book book=new Book("author12", "title16", "callNo16",11);
		//Test for true value that the book is damaged.
		boolean t1=book.returnBook(false);
		
		assertTrue("The testing for the method returnBook() was not successfull",t1);
		
		
	}

}
