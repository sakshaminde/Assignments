package ass2Que2;

public class HardDisk extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer H1 = new HardDisk();
		H1.show();
		H1.hardDisk();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of HardDisk");
	}

	@Override
	String hardDisk() {
		// TODO Auto-generated method stub
		System.out.println("This is HardDisk used for storage purpose");
		return "This is HardDisk";
		
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
