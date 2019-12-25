package methodOverriding;
/*
 * We can not inherit Private, Static and Final Members.
 * Method overriding is always give preference to child class if same method already available in parent class.
 * static members are class members and we can call directly using "className"."methodName"
*/
public class thisIsChild extends thisIsParent{
	public void m1(){ //Same method is defined in parent.
		System.out.println("You are in c m1.");
	}
	public void m2(){
		System.out.println("You are in c m2.");
	}
	
	public static void main(String[] args){
		thisIsChild obj=new thisIsChild();
		obj.m1();
		obj.m2();
		thisIsParent.m3();
		obj.m4();
		
		System.out.println("--------------");
		
		thisIsParent obj2 = new thisIsParent();
		obj2.m1();
		obj2.m2();
		
		System.out.println("-------------");
		
		thisIsParent obj3 = new thisIsChild();
		obj3.m1();
		obj3.m2();
	}
	
}


