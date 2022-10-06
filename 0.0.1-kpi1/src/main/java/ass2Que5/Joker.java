package ass2Que5;

public class Joker {
	static int i=1;
	String cir_name;
	String jok_dance;
	 Joker()
	{
		cir_name = "Dhoom(Amir Khan) Circus";
	}
	Joker(String jok_dance)
	{
		this.jok_dance = jok_dance;
	}
	String name()
	{
		System.out.println("Circus Name :"+cir_name);
		return "cir_name";
	}
	String show()
	{
		System.out.println("Joker"+ (i++) +" is Dancing :"+jok_dance);
		return "jok_dance";
	}
	static String show1()
	{
		Joker J12 = new Joker("Hip Hop Dance");
		J12.show();
		return "jok_dance";
	}
	static String show2()
	{
		Joker J13 = new Joker("Ballet");
		J13.show();
		return "jok_dance";
	}
	static String show3()
	{
		Joker J14 = new Joker("Swing");
		J14.show();
		return "jok_dance";
	}
	static String show4()
	{
		Joker J15 = new Joker("Salsa");
		J15.show();
		return "jok_dance";
	}
	static String show5()
	{
		Joker J16 = new Joker("Polka");
		J16.show();
		return "jok_dance";
	}
	static String show6()
	{
		Joker J17 = new Joker("Belly");
		J17.show();
		return "jok_dance";
	}
	static String show7()
	{
		Joker J18 = new Joker("Folk");
		J18.show();
		return "jok_dance";
	}
	static String show8()
	{
		Joker J19 = new Joker("Ballroom");
		J19.show();
		return "jok_dance";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joker J111 = new Joker();
		J111.name();
		
		 //Joker J11 = new Joker("Hip Hop Dance"); J11.show();
		 
		Joker J113 = new Joker();
		J113.name();
		//	Joker J12 = new Joker("Ballet");
		//	J12.show();
		Joker J114 = new Joker();
		J114.name();
		//	Joker J13 = new Joker("Swing");
		//	J13.show();
		Joker J115 = new Joker();
		J115.name();
		//	Joker J14 = new Joker("Salsa");
		//	J14.show();
		Joker J116 = new Joker();
		J116.name();
		//	Joker J15 = new Joker("Polka");
		//	J15.show();
		Joker J117 = new Joker();
		J117.name();
		//	Joker J16 = new Joker("Belly");
		//	J16.show();
		Joker J118 = new Joker();
		J118.name();
		//	Joker J17 = new Joker("Folk");
		//	J17.show();
		Joker J119 = new Joker();
		J119.name();
		//	Joker J18 = new Joker("Ballroom");
		//	J18.show();
		
	}

}
