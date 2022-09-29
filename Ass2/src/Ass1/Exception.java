package Ass1;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = 34/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Final block executed");
		}
	}

}
