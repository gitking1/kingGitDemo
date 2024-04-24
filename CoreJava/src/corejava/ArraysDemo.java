package corejava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a container which stores multiple value of same datatype is called array
		// below is declaring array by allocating memory
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 6;
		a[2] = 9;
		a[3] = 1;
		a[4] = 12;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*****************");
		System.out.println("changes by git Y");
		int b[] = { 1, 4, 3, 5, 7, 8 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
