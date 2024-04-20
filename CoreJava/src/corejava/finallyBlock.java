package corejava;

public class finallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[] = new int[5];
			System.out.println(arr[7]);
		} /*catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched index out of bound exception");
		} catch (Exception e) {
			System.out.println("I catched the error/exception");
		}*/
		finally {
			System.out.println("delete cookies");
		}
	}

}
