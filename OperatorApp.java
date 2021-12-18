

public class OperatorApp {
	
	static void increment() {
		int val=10;
		System.out.println("Before increment "+val);
		val++;
		System.out.println("After increment "+val);
	}
	
	static void decrement() {
		int val=10;
		System.out.println("Before decrement "+val);
		val--;
		System.out.println("After decrement "+val);
	}
	
	public static void main() {
		increment();
		decrement();
	}

}
