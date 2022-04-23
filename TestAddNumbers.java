package JUnitTestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestAddNumbers {


	@Test
	public void test() {
		JUnitFuntion junit=new JUnitFuntion();
		int result= junit.addnumber(100,200);
		assertEquals(300,result);
	}

}
