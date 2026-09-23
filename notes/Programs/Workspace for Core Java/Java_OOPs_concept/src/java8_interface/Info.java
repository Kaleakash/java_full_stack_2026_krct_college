package java8_interface;

public interface Info {
	abstract void dis1();	// by default abstract 
	default void dis2() {
		System.out.println("default implementation");
	}
	static void dis3() {
		System.out.println("static implementation");
	}
}
class Test implements Info {
	@Override
	public void dis1(){
		System.out.println("provided body for abstract method ");
	}
	@Override
	public void dis2(){
		System.out.println("provided body for default method ");
	}
//	@Override
//	public void dis3(){
//		System.out.println("static method can't override");
//	}
}
