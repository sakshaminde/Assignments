package assQue5;

public class Test2 implements Interface, Interface1{
	public void show()
	{
		Interface.super.show();
		Interface1.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 T1 = new Test2();
		T1.show();
	}

}
