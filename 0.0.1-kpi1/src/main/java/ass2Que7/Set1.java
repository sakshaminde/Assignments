package ass2Que7;
import java.util.HashSet;
import java.util.Set;
public class Set1 {
	public int show2()
	{
	Set<Integer> s1 = new HashSet<Integer>();
	s1.add(1);
	s1.add(1);
	s1.add(2);
	s1.add(3);
	s1.add(3);
	s1.add(2);
	s1.add(1);
	s1.add(1);
	s1.add(3);
	s1.add(3);
	s1.add(1);
	s1.add(2);
	s1.add(15);
	s1.add(10);
	s1.add(4);
	s1.add(5);
	s1.add(6);
	s1.add(7);
	s1.add(8);
	s1.add(8);
	System.out.println(s1);
	int last_Element = 0;
	for(int x : s1)
	{
		last_Element = x;
	}
	System.out.println("Last Element is:"+ last_Element);
	return last_Element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1 s1 = new Set1();
		s1.show2();
	}
}
