package ass2Que7;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		s1.add(3);
		s1.add(10);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		System.out.println(s1);
		System.out.println("Last Element is"+ s1.last());
	}

}
