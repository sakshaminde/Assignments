package ass2Que2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AllInOneTest {
	@Test
	public void check()
	{
		CPU cpu1 = new CPU();
		assertEquals("This is CPU",cpu1.cpu());
		HardDisk hd1 = new HardDisk();
		assertEquals("This is HardDisk",hd1.hardDisk());
		Joystick j1 = new Joystick();
		assertEquals("This is Joystick",j1.joystick());
		Keyboard K1 = new Keyboard();
		assertEquals("This is Keyboard",K1.keyoard());
		Monitor m1 = new Monitor();
		assertEquals("This is Monitor",m1.monitor());
		Motherboard m12 = new Motherboard();
		assertEquals("This is Motherboard",m12.motherboard());
		Mouse m123 = new Mouse();
		assertEquals("This is Mouse",m123.mouse());
		NIC n1 = new NIC();
		assertEquals("This is Network Interfacing Card(NIC)",n1.nic());
		OperatingSystem os1 = new OperatingSystem();
		assertEquals("Operating System is System software",os1.os());
		RAM r1 = new RAM();
		assertEquals("This is RAM",r1.RAM1());
		
	}

}
