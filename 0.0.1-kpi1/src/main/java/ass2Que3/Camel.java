package ass2Que3;

public class Camel implements Runnable {
	public void run()
	{
		System.out.println("Camel is wild as well as pet animal");
	}
	public int legs()
	{
		System.out.println("Camel have 4 legs");
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camel C1 = new Camel();
		Thread T2 = new Thread(C1, "My second thread");
		T2.start();
		String str = T2.getName();
		System.out.println(str);

	}

}
