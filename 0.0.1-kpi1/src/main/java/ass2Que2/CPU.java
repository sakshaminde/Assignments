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
	void cpu() {
		// TODO Auto-generated method stub
		System.out.println("This is CPU used for processing on input and providing output");
	}

}
