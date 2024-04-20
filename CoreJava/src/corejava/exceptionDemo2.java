package corejava;

public class exceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 7;
		int c = 0;
		try {
			int arr[] = new int[5];
			System.out.println(arr[7]);
		} catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched index out of bound exception");
		} catch (Exception e) {
			System.out.println("I catched the error/exception");
		}

	}

}
