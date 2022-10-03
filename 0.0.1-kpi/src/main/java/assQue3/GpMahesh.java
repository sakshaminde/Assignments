package assQue3;

public class GpMahesh extends GgpRamesh implements Human {
	static int money(int m) {
		System.out.println("Father money property");
		return 0;
	}
	static double money(double m)
	{
		System.out.println(m);
		return m;
	}
	static String houseName1(String str) {
		System.out.println("Father House property");
		return str;
	}
	@Override
	int absMoney() {
		// TODO Auto-generated method stub
		System.out.println("(Abstract Method) Mahesh and his sibling can access money");
		return 0;
	}
	@Override
	String absHouseName() {
		// TODO Auto-generated method stub
		System.out.println("(Abstract Method) Mahesh and his sibling can access Row house");
		return null;
	}

}
