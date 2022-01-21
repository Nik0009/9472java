import java.util.LinkedList;

public class InsertElementsInFirstNLastPositonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("linked list:" + list); 
        
        list.addFirst("X");
        
        list.addLast("Y");
        
          System.out.println("Final linked list:" + list);  
		
	}

}
/*
linked list:[A, B, C]
Final linked list:[X, A, B, C, Y]
*/