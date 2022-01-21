import java.util.LinkedList;

public class InsertEleInLInkinedListDemo {

	public static void main(String[] args) {
		 LinkedList<String> a = new LinkedList<String>();
		 
		          a.add("X");
		          a.add("Y");
		          a.add("Z");
		     System.out.println("linked list:" + a); 
		     
		     a.offerFirst("A");
		     
		     System.out.println("Final linked list:" + a);
	}

}
/*
linked list:[X, Y, Z]
Final linked list:[A, X, Y, Z]
 */