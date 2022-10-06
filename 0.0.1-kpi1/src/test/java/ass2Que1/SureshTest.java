package ass2Que1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SureshTest {
	@Test
	public void testShow()
	{
		Suresh S1 = new Suresh(101,"Suresh",34,"Hanuman","10/May/1972",8,"Working","Data Engineer");
		assertEquals(101,S1.empID());
		assertEquals("Suresh", S1.empName());
		assertEquals("Hanuman",S1.empFatherName());
		assertEquals("10/May/1972",S1.empDOB());
		assertEquals(34,S1.empAge());
		assertEquals("Data Engineer",S1.empRole());
		assertEquals(8,S1.empWorkHr());
		assertEquals("Working",S1.empWorkStatus());
		
	}
	

}
