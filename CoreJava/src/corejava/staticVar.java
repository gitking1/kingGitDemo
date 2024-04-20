package corejava;

public class staticVar {
	String name;
	String address;
	// static String city = "Bangalore";
	// static int i = 0;
	// Above 2 codes can also be written as below codes of static block where we can
	// initialize static variables under static block
	static String city;
	static int i;
	static {
		city = "Bangalore";
		i = 0;
	}

	staticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity() {
		System.out.println(city);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar obj = new staticVar("Bob", "Marathalli");
		staticVar obj1 = new staticVar("Ram", "Jayanagar");
		obj.getAddress();
		obj1.getAddress();
		// to call static methods directly by className & not objects
		staticVar.getCity();
		// static variables can assigned by clasName
		staticVar.i = 4;
		obj.address = "pune";
		staticVar.getCity();
		obj.getAddress();
	}

}
