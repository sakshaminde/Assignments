package Ass3;

public class Ramesh extends Men{
		int action()
		{
			System.out.println(super.action());
			return 0;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Men r1 = new Ramesh();
		r1.action();
	}

}
