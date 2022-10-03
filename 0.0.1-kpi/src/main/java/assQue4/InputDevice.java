package assQue4;

import java.util.Scanner;

public class InputDevice {
	//Scanner sc = new Scanner(System.in);
	//String str = sc.nextLine();
	void input(String str)
	{
		if((str=="Keyboard") || (str=="Mouse") || (str=="Joystick") || (str=="Scanner") || (str=="Microphone") || (str=="Webcam"))
		{
			System.out.println(str+"is Input device");
		}
		else
			System.out.println("This is not input device");
	}

}
