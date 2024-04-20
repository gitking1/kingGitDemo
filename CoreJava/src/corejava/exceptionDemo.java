package corejava;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 7;
		int c = 0;
		try {
			int k = b / c;
			System.out.println(k);
		} catch (ArithmeticException at) {
			System.out.println("I catched the arithmetic exception");
		} catch (Exception e) {
			System.out.println("I catched the error/exception");
		}

	}

}
