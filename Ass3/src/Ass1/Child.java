package Ass1;

public class Child extends Parent{
			void relation()
			{
				System.out.println("Is Child");
			}
			void age()
			{
				System.out.println("45");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c1 = new Child();
		Parent p1 = new Parent();
		c1.relation();
		c1.age();
		p1.age();
		p1.relation();
	}

}
