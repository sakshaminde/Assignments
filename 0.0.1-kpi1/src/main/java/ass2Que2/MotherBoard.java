package ass2Que2;

public class MotherBoard extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer M2 = new MotherBoard();
		M2.show();
		M2.motherboard();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of MotherBoard");
	}

	@Override
	void motherboard() {
		// TODO Auto-generated method stub
		System.out.println("This is MotherBoard used for including some hardware parts");
		
	}

}
