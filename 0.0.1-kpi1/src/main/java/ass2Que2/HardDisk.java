package ass2Que2;

public class HardDisk extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer H1 = new HardDisk();
		H1.show();
		H1.hardDisk();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of HardDisk");
	}

	@Override
	void hardDisk() {
		// TODO Auto-generated method stub
		System.out.println("This is HardDisk used for storage purpose");
		
	}

}
