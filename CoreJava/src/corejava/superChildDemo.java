package corejava;

public class superChildDemo extends superParentDemo {
	String name = "QAClickAcademy";

	public superChildDemo() {
		// super keyword to call parent constructor from child constructor in 1st line
		// always
		super();
		System.out.println("Child Class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superChildDemo cd = new superChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
