package ass2Que2;

public class Motherboard extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer M2 = new Motherboard();
		M2.show();
		M2.motherboard();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of MotherBoard");
	}

	@Override
	 String motherboard() {
		// TODO Auto-generated method stub
		System.out.println("This is MotherBoard used for including some hardware parts");
		return "This is Motherboard";
	}

	@Override
	String cpu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String hardDisk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String joystick() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String keyoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String monitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String mouse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String nic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String os() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String RAM1() {
		// TODO Auto-generated method stub
		return null;
	}

}
