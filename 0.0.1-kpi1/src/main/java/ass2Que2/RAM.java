package ass2Que2;

public class RAM extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer R1 = new RAM();
		R1.show();
		R1.RAM1();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of RAM");
		
	}

	@Override
	String RAM1() {
		// TODO Auto-generated method stub
		System.out.println("This is RAM. Used for temporary storage");
		return "This is RAM";
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
	String nic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String os() {
		// TODO Auto-generated method stub
		return null;
	}

}
