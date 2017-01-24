package cegeka.org;

import java.io.IOException;

public class StartApp {

	static IBusiness _business = null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Application started");
		//ok
		_business = new Business();
		try{
			_business.DoSomething();
		}
		catch(IOException e){
			// whatever
		}
	}

}
