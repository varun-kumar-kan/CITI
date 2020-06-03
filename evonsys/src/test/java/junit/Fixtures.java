package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures {

	@BeforeClass
	public static void setup(){
		System.out.println(1);
	}
	@Test
	public void test(){
		System.out.println(3);
	
	}
	
	@AfterClass
	public static void tearDown(){
		System.out.println(2);
	}
}
