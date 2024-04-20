package corejava;

//class final then we can't inherit it
//basically this class can't be a parent class for any child
final class finalDemo {
	// method final means we can't over-ride it
	final void getData() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 4;
		// i=5; this will throw error as variable marked as final so we can't change it
	}

}
