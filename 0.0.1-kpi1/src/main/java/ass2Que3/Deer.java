package ass2Que3;

public class Deer implements Runnable {
	public void run()
	{
		System.out.println("Deer is pet as well as wild animal");
	}
	public int legs()
	{
		System.out.println("Deer have 4 legs");
		return 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer D1 = new Deer();
		Thread T4 = new Thread(D1, "My fourth thread");
		T4.start();
		String str = T4.getName();
		System.out.println(str);


	}

}
