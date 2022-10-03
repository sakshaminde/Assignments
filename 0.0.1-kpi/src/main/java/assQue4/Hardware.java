package assQue4;

import java.util.Scanner;

public class Hardware {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println("Enter computer hardware parts for verify");
	void hardware(String str)
	{
		if((str=="Mouse") || (str=="Keyboard") || (str=="Motherboard") || (str=="CPU") || (str=="RAM") || (str=="Monitor") || (str=="Hard-Disk"))
		{
			System.out.println(str+" "+"is computer hardware part");
		}
		else
		{
			System.out.println( str + "is not a hardware part of computer");
		}
	}
	void use(String str)
	{
		if(str=="Mouse")
		System.out.println("Control the range of things on a computer");
		else if(str=="Keyboard")
			System.out.println("For typing purpose");
		else if(str=="Motherboard")
			System.out.println("Ties the computer's components together at once spot and allows them to talk to each other");
		else if(str=="CPU")
			System.out.println("For processing on input and gives output");
		else if(str=="RAM")
			System.out.println("Used as short term memory");
		else if(str=="Monitor")
			System.out.println("For screening data");
		else if(str=="Hard-Disk")
			System.out.println("For storing of data permenantly");
		
	}

}
