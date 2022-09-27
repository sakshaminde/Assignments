package Ass1;

public class Animal implements Dog, Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.bark();
		a1.run();
		a1.mew();
		a1.climb();
	}

	@Override
	public void mew() {
		// TODO Auto-generated method stub
		System.out.println("Cat sound like Mew");
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		System.out.println("Cat climb on Tree");	
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog sound like Bhow Wow");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog run on Road");
	}

}
