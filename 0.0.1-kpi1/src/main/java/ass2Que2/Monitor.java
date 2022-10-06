package ass2Que2;

public class Monitor extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer M3 = new Monitor();
		M3.show();
		M3.monitor();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Monitor");
	}

	@Override
	String monitor() {
		// TODO Auto-generated method stub
		System.out.println("This is Monitor used for Screening data");
		return "This is Monitor";
	}

	@Override
	String motherboard() {
		// TODO Auto-generated method stub
		return null;
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
