
import java.util.LinkedList;

public class InserSomeEleInLinkedListAtSpecificPositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list = new LinkedList <String> ();
	
		 list.add("A");
		  list.add("B");
		 list.add("C");

		  
		  System.out.println("linked list:" + list);

		  LinkedList <String> new_l_list = new LinkedList <String> ();
		  new_l_list.add("X");
		  new_l_list.add("Y");

		  list.addAll(1, new_l_list);
		  
		  System.out.println("After adding new elements in LinkedList:" + list);
		
	}

}
/*
linked list:[A, B, C]
After adding new elements in LinkedList:[A, X, Y, B, C]

*/