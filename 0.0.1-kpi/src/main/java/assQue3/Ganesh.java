package assQue3;

public class Ganesh extends GpMahesh {
	
	private int money(int m)
	{
		System.out.println(m);
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  GpMahesh G1 = new GpMahesh(); 
		  Ganesh g1 = new Ganesh(); 
		  g1.money(500);
		  g1.human(); 
		  G1.absHouseName(); 
		  G1.houseName1(); 
		  G1.absMoney(); 
		  G1.human();
		  G1.money(3456.678);
		 
	}

}
