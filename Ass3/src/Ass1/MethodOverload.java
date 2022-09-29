package Ass1;

public class MethodOverload {
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload M1 = new MethodOverload();
		M1.add(5, 6);
		M1.add(2, 3, 4);
	}

}
