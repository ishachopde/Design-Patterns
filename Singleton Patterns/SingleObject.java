package singleton.org;

//create a singleton class


//SingleObject class 
//provides a static method to get its static instance to outside world.

public class SingleObject {

	//create a private object
	private static SingleObject singleobject = new SingleObject();
	
	
	// make the constructor private so that the class cannot be instantiated
	private SingleObject() {
		
	}
	
	// get the only object available
	public static SingleObject getInstance() {
		return singleobject;
	}
	
	public void showMessage() {
		System.out.println("Hello Isha");
	}
}
