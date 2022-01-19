import java.util.*;

public class EmptyArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> L1=new ArrayList();
		L1.add("X");
		L1.add("Y");
		L1.add("Z");
		System.out.print("ArrayList Before Removing All Elements :-"+L1);
		System.out.println();
		
		L1.removeAll(L1);
		System.out.print("ArrayList After Removing All Elements :-"+L1);
	}

}
/*
o/p-
ArrayList Before Removing All Elements :-[X, Y, Z]
ArrayList After Removing All Elements :-[]
*/