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
		
		_testInterface.DoSomething();
		
	}
}
