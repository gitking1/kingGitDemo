package corejava;

public class constructorDemo {
	// constructor will not return any vale
	// constructor name will be class name only
	public constructorDemo() {
		System.out.println("I am in constructor");
		System.out.println("I am in constructor lecture 1");
	}

	public constructorDemo(String str) {
		System.out.println("I am in the paremeterized constructor with 1 string param");
		System.out.println(str);
	}

	public constructorDemo(int a, int b) {
		System.out.println("I am in the paremeterized constructor with 2 int param");
		int c = a + b;
		System.out.println(c);
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructor will get called by creating object of class
		constructorDemo cd = new constructorDemo();
		constructorDemo c = new constructorDemo("hello");
		constructorDemo d = new constructorDemo(3, 4);
	}

}
