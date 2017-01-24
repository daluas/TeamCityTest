package cegeka.org.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cegeka.org.Business;
import cegeka.org.IBusiness;

@RunWith(Suite.class)
@SuiteClasses({})
public class BusinessTest {
	IBusiness _testInterface;
	 @Test(expected = IOException.class)
	public void TestDoSomething(){
		_testInterface = new Business();
		try {
			_testInterface.DoSomething();
			fail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
