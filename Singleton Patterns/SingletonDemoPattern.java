package singleton.org;

public class SingletonDemoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get the only obj from singleObject class
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
