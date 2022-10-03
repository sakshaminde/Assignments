package assQue4;

public class OutputDevice {
	void output(String str)
	{
		if((str=="Monitor") || (str=="Printer") || (str=="Speakers") || (str=="Plotter") || (str=="Projector") || (str=="Headphones"))
		{
			System.out.println(str+"is Output device");
		}
		else
			System.out.println("This is not output device");
	}
}
