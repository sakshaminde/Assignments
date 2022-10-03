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
	void monitor() {
		// TODO Auto-generated method stub
		System.out.println("This is Monitor used for Screening data");
		
	}

}
