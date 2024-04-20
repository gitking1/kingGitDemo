package demopack;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		//ParentAirCraft p = new ParentAirCraft();---not possible as parent class marked as abstract	
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("red color on the body");
	}

}
