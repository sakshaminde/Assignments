package ass2Que3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AllAnimalTest {
	@Test
	public void check()
	{
		Buffalo B1 = new Buffalo();
		assertEquals(4,B1.legs());
		Camel C1 = new Camel();
		assertEquals(4,C1.legs());
		Cow C2 = new Cow();
		assertEquals("Pet",C2.status());
		Deer D1 = new Deer();
		assertEquals(4,D1.legs());
		Dog D2 = new Dog();
		assertEquals(4,D2.legs());
		Elephant E1 = new Elephant();
		assertEquals(4,E1.legs());
		Lion L1 = new Lion();
		assertEquals(4,L1.legs());
		Tiger T1 = new Tiger();
		assertEquals(4,T1.legs());
		Wolf W1 = new Wolf();
		assertEquals(4,W1.legs());
		Zebra Z1 = new Zebra();
		assertEquals(4,Z1.legs());
	}

}
