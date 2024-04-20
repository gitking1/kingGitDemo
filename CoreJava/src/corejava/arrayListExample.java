package corejava;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can accept duplicate values
		//Arraylist, linked list & vector implements List interface
		//arrays have fixed size whereas arraylist can grow dynamically
		//we can access & insert any value at any index
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java");
		System.out.println(a);
		/*a.remove(1);
		 * a.remove("java");
		 * System.out.println(a);
		 */
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
