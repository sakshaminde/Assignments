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
	void mouse() {
		// TODO Auto-generated method stub
		System.out.println("This is Mouse used for pointing");
	}

}
