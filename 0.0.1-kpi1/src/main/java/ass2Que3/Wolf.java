package ass2Que3;

public class Wolf implements Runnable{
	public void run()
	{
		System.out.println("Wolf is wild animal");
	}
	public int legs()
	{
		System.out.println("Wolf have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolf W1 = new Wolf();
		Thread T9 = new Thread(W1, "My nine thread");
		T9.start();
		String str = T9.getName();
		System.out.println(str);
	}

}
