import java.util.LinkedList;

public class InsertEleInInkinedlistAtLastPositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> b= new LinkedList<String>();
				b.add("Red");
				b.add("Blue");
				b.add("Green");
		          
				System.out.println("linked list:" +b);
		     
				b.offerLast("White");
				System.out.println("Final linked list:" + b); 
	}

}
/*
linked list:[Red, Blue, Green]
Final linked list:[Red, Blue, Green, White]
 
*/