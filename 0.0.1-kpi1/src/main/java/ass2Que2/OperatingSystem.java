package ass2Que2;

public class OperatingSystem extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer OS = new OperatingSystem();
		OS.show();
		OS.os();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Operating System");
	}

	@Override
	void os() {
		// TODO Auto-generated method stub
		System.out.println("Operating System is System software which is used for running computer instructions");
	}

}
