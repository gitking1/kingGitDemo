package corejava;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c = new AustralianTraffic();
		AustralianTraffic at = new AustralianTraffic();
		ContinentalTraffic ct = new AustralianTraffic();
		c.redStop();
		c.greenGo();
		c.flashYellow();
		ct.trainSymbol();
		at.walkOnSymbol();
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("train symbol run");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("now go as it is green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("stop as it is red light");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("alert as it is flashing yellow");
	}

	public void walkOnSymbol() {
		System.out.println("walk quickly on walk symbol");
	}

}
