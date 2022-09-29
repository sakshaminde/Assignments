package Ass2;

public class Enc extends Abs{
	private int a=10;
	private void write()
	{
		System.out.println("This is private method");
	}
	//System.out.println("Value of a is: " + a );
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enc E1 = new Enc();
		E1.write();
		E1.show();
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Value of a is: " + a );
		
	}

}
