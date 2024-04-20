package corejava;

public class childClassDemo extends parentClassDemo {
	public static void main(String[] args) {
		childClassDemo cd = new childClassDemo();
		cd.colour();
		cd.brakes();
		cd.gear();
	}

	public void engine() {
		System.out.println("new gen engine");
	}

	public void colour() {
		System.out.println(colour);
	}

//method overriding
	public void gear() {
		System.out.println("child gear code");
	}
}
