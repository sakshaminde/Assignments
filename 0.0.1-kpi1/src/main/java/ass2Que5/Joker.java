package ass2Que5;

public class Joker {
	static int i=1;
	String cir_name;
	String jok_dance;
	 Joker()
	{
		cir_name = "Dhoom Circus";
	}
	Joker(String jok_dance)
	{
		this.jok_dance = jok_dance;
	}
	void name()
	{
		System.out.println("Circus Name :"+cir_name);
	}
	void show()
	{
		System.out.println("Joker"+ (i++) +" is Dancing :"+jok_dance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joker J111 = new Joker();
		J111.name();
		Joker J113 = new Joker();
		J113.name();
		Joker J114 = new Joker();
		J114.name();
		Joker J115 = new Joker();
		J115.name();
		Joker J116 = new Joker();
		J116.name();
		Joker J117 = new Joker();
		J117.name();
		Joker J118 = new Joker();
		J118.name();
		Joker J119 = new Joker();
		J119.name();
		
		Joker J11 = new Joker("Hip Hop Dance");
		J11.show();
		Joker J12 = new Joker("Ballet");
		J12.show();
		Joker J13 = new Joker("Swing");
		J13.show();
		Joker J14 = new Joker("Salsa");
		J14.show();
		Joker J15 = new Joker("Polka");
		J15.show();
		Joker J16 = new Joker("Belly");
		J16.show();
		Joker J17 = new Joker("Folk");
		J17.show();
		Joker J18 = new Joker("Ballroom");
		J18.show();
	}

}
