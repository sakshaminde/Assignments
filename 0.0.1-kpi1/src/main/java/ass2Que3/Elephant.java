package ass2Que3;

public class Elephant implements Runnable{
	public void run()
	{
		System.out.println("Elephant is wild animal");
	}
	public int legs()
	{
		System.out.println("Elephant have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant E1 = new Elephant();
		Thread T6 = new Thread(E1, "My sixth thread");
		T6.start();
		String str = T6.getName();
		System.out.println(str);

	}

}
