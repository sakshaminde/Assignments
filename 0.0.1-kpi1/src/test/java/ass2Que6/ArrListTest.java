package ass2Que6;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ArrListTest {
	@Test
	public void check_pos()
	{
		ArrList A1 = new ArrList();
		assertEquals(2,A1.check());
	}

}
