package ass2Que3;

public class Tiger implements Runnable {
	public void run()
	{
		System.out.println("Tiger is wild animal");
	}
	public int legs()
	{
		System.out.println("Tiger have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger T1 = new Tiger();
		Thread T8 = new Thread(T1, "My eight thread");
		T8.start();
		String str = T8.getName();
		System.out.println(str);
	}

}
