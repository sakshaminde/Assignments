package ass2Que2;

public class NIC extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer N1 = new NIC();
		N1.show();
		N1.nic();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of NIC");
	}

	@Override
	String nic() {
		// TODO Auto-generated method stub
		System.out.println("This is Network Interfacing Card(NIC) used for connect to network");
		return "This is Network Interfacing Card(NIC)";
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
	String mouse() {
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
