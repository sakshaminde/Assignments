package ass2Que2;

public class RAM extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer R1 = new RAM();
		R1.show();
		R1.RAM1();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of RAM");
		
	}

	@Override
	void RAM1() {
		// TODO Auto-generated method stub
		System.out.println("This is RAM. Used for temporary storage");
		
	}

}
