import java.util.LinkedList;

public class InsertSpecificEleINLinkedListAtSpecificPositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> A = new LinkedList <String> ();
		
		A.add("1");
		A.add("2");
		A.add("3");
		A.add("4");
		A.add("5");
		System.out.println("Before linked list: "+A);
		System.out.println("C Added after 1.");
		
		A.add(1, "C");
		
		System.out.println("After Adding Element in linked list:" + A);
		
	}

}
/*
Before linked list: [1, 2, 3, 4, 5]
C Added after 1
After Adding Element in linked list:[1, C, 2, 3, 4, 5]
*/