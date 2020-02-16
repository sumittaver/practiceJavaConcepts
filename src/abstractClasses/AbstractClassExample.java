//Example of Abstract class and Methods
package abstractClasses;

public class AbstractClassExample {
	public static void main(String args[]){
		NewPhone obj = new NewPhone();
		obj.call();
	}
}



class NewPhone{
	public void call(){
		System.out.println("Calling newPhone.");
	}
}


