package ass2Que2;

public class Joystick extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer J1 = new Joystick();
		J1.show();
		J1.joystick();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Joystick");
	}

	@Override
	String joystick() {
		// TODO Auto-generated method stub
		System.out.println("This is Joystick used for playing games");
		return "This is Joystick";
		
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
