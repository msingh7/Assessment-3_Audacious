package library.Tests.integrTest;
import library.Main;
import library.daos.BookDAO;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassmainT {
	
	
	@Test
	
	public void testMain() {
		Main main=new Main();
		main.setupTestData();
		main.bookda.getBookByID(1);
		String name=main.bookda.title1;
		assertEquals("The test failed"," title1",name);
		
	}
}

		