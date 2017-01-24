package cegeka.org.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cegeka.org.Business;
import cegeka.org.IBusiness;

public class BusinessTest {
	IBusiness _testInterface;
	 @Test(expected = ArithmeticException.class)
	public void TestDoSomething(){
		_testInterface = new Business();
		try {
			_testInterface.DoSomething();
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (e instanceof ArithmeticException){
				
			}
			else			{
				fail();
			}
			e.printStackTrace();
		}
		
	}
}
