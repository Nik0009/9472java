import java.util.*;

public class JoinTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List1=new ArrayList();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		System.out.print("List1:-"+List1);
		System.out.println();
		
		ArrayList<String> List2=new ArrayList();
		List2.add("X");
		List2.add("Y");
		List2.add("Z");
		System.out.print("List2:-"+List2);
		System.out.println();
		
		List1.addAll(List2);
		System.out.print("After joining two ArrayList:-:-"+List1);
		System.out.println();
	}

}
/*
o/p-
List1:-[A, B, C]
List2:-[X, Y, Z]
After joining two ArrayList:-:-[A, B, C, X, Y, Z]
*/