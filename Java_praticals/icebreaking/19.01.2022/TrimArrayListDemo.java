import java.util.*;

public class TrimArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList(6);
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.print("ArrayList:-"+list);
		System.out.println();
		list.trimToSize();
		System.out.println("After Using TrimToSize() :-"+list);
	}
}
/*
o/p-
ArrayList:-[a, b, c]
After Using TrimToSize() :-[a, b, c]
*/