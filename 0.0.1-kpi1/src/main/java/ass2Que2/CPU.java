package ass2Que2;

public class CPU extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer C1 = new CPU();
		C1.show();
		C1.cpu();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of CPU");
	}

	@Override
	String cpu() {
		// TODO Auto-generated method stub
		System.out.println("This is CPU used for processing on input and providing output");
		return "This is CPU";
	}

	@Override
	String motherboard() {
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
