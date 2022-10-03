package ass2Que2;

public class Keyboard extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer K1 = new Keyboard();
		K1.show();
		K1.keyoard();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Keyboard");
	}

	@Override
	void keyoard() {
		// TODO Auto-generated method stub
		System.out.println("This is Keyboard used for typing purpose");
		
	}

}
