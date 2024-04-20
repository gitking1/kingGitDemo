package corejava;

public class functionOverloading extends childClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method having same name but differ by argument count or argument datatype
		functionOverloading fo = new functionOverloading();
		fo.getData(2);
		fo.getData("hello");
		fo.getData(3, 5);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(b);
	}
}
