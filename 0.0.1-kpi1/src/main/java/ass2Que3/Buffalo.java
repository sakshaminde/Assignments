package ass2Que3;

public class Buffalo implements Runnable{
	public void run()
	{
		System.out.println("Buffalo is pet animal");
	}
	public int legs()
	{
		System.out.println("Buffalo have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffalo B1 = new Buffalo();
		Thread T1 = new Thread(B1, "My first thread");
		T1.start();
		String str = T1.getName();
		System.out.println(str);
	}

}
