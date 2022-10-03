package ass2Que6;
import java.util.ArrayList;
public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("1");
		System.out.println("List1"+list1);
		ArrayList list2 = new ArrayList();
		list2.add("e");
		list2.add("f");
		list2.add("c");
		list2.add("34");
		list2.add("g");
		System.out.println("List2"+list2);
		ArrayList list3 = new ArrayList();
		list3.add("h");
		list3.add("i");
		list3.add("c");
		list3.add("j");
		System.out.println("List3"+list3);
		ArrayList list4 = new ArrayList();
		list4.add("k");
		list4.add("l");
		list4.add("c");
		list4.add("m");
		System.out.println("List4"+list4);
		ArrayList list5 = new ArrayList();
		list5.add("n");
		list5.add("o");
		list5.add("c");
		list5.add("p");
		list5.add("q");
		list5.add("r");
		System.out.println("List5"+list5);
		list1.retainAll(list5);
		System.out.println("Common Elements"+list1);
	}

}
