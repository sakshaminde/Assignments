package ass2Que3;

public class Cow implements Runnable {
	public void run()
	{
		System.out.println("Cow is pet animal");
	}
	public String status()
	{
		System.out.println("Pet Animal");
		return "Pet";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow C2 = new Cow();
		Thread T3 = new Thread(C2, "My third thread");
		T3.start();
		String str = T3.getName();
		System.out.println(str);

		

	}

}
