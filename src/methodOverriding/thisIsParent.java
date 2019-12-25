package methodOverriding;

public class thisIsParent {
	public void m1(){
		System.out.println("You are in p m1.");
	}
	public void m2(){
		System.out.println("You are in p m2.");
	}
	public static /*this is Static*/ void m3(){
		System.out.println("You are in p m3");
	}
	public void m4(){
		System.out.println("You are in p m4.");
	}
}
