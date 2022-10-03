package ass2Que3;

public class Dog implements Runnable{
	public void run()
	{
		System.out.println("Dog is pet animal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog D2 = new Dog();
		Thread T5 = new Thread(D2, "My fifth thread");
		T5.start();
		String str = T5.getName();
		System.out.println(str);

	}

}
