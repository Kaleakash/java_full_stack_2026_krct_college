package java8_interface;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
    //int sub(int a, int b);
}
class CalculatorImp implements Calculator {
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new CalculatorImp();
		System.out.println("Sum of two number using legacy separate class "+c1.sum(100, 200));
		// we providing body for Calculator using lambda style 
		// by default return the value without return keyword. 
		Calculator c2 = (int a, int b)->a+b;
		System.out.println("Sum of two number using lambda style "+c2.sum(10, 20));
	}

}
