package assQue3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class GaneshTest {
	
	@Test
	public void check_det()
	{
		  Ganesh g1 = new Ganesh(); 
		  String str = g1.houseName1("RowHouse"); 
		  assertEquals("RowHouse", str);
	}

}
