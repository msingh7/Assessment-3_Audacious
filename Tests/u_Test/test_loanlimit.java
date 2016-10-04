package library.Tests.u_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Entities.Member;

public class test_loanlimit {

	@Test
	public void test11() {
		Member m1=new Member("Firstname","LastName","101","fl@gmail.com",11);
		boolean t1=m1.hasReachedLoanLimit();
		assertTrue("The testing was not successfull",t1);
		
	}
	@Test
		public void test12(){
			Member m2=new Member("Fname","LName","103","f2@gmail.com",12);
			boolean t2=m2.hasReachedLoanLimit();
			assertFalse("The testing was not successfull",t2);
		}
}
