package ass2Que3;

public class Lion implements Runnable{
	public void run()
	{
		System.out.println("Lion is wild animal");
	}
	public int legs()
	{
		System.out.println("Lion have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion L1 = new Lion();
		Thread T7 = new Thread(L1, "My seven thread");
		T7.start();
		String str = T7.getName();
		System.out.println(str);

	}

}
