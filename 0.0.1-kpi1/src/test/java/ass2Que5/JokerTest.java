package ass2Que5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JokerTest {
	@Test
	public void check()
	{
		Joker J1 = new Joker();
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show1());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show2());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show3());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show4());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show5());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show6());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show7());
		assertEquals("cir_name",J1.name());
		assertEquals("jok_dance",J1.show8());
	}

}
