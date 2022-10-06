package ass2Que2;

public class Mouse extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer M1 = new Mouse();
		M1.show();
		M1.mouse();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Mouse");
	}

	@Override
	String mouse() {
		// TODO Auto-generated method stub
		System.out.println("This is Mouse used for pointing");
		return "This is Mouse";
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
	String monitor() {
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
