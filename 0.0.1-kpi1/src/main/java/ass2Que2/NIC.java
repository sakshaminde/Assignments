package ass2Que2;

public class NIC extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer N1 = new NIC();
		N1.show();
		N1.nic();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of NIC");
	}

	@Override
	void nic() {
		// TODO Auto-generated method stub
		System.out.println("This is Network Interfacing Card(NIC) used for connect to network");
	}

}
