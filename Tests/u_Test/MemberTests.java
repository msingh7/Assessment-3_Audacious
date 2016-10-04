package library.Tests.u_Test;

import static org.junit.Assert.*;
import library.Entities.Member;

import org.junit.Test;

public class MemberTests {

	@Test
	public void test() {
		Member m1=new Member("FName1","IName1","002","email1",12);
		boolean t1=m1.hasOverDueLoans();
		assertFalse("The testing for the method hasOverDueLoans() was not successfull",t1);
	}

}
