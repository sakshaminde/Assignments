package ass2Que3;

public class Zebra implements Runnable{
	public void run()
	{
		System.out.println("Zebra is wild animal");
	}
	public int legs()
	{
		System.out.println("Zebra have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zebra Z1 = new Zebra();
		Thread T10 = new Thread(Z1, "My ten thread");
		T10.start();
		String str = T10.getName();
		System.out.println(str);

	}

}
