package ass2Que2;

public class Joystick extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer J1 = new Joystick();
		J1.show();
		J1.joystick();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Joystick");
	}

	@Override
	void joystick() {
		// TODO Auto-generated method stub
		System.out.println("This is Joystick used for playing games");
		
	}

}
