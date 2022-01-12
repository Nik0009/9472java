import java.util.*;

public class ProblemNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> zoo=new ArrayList();
		zoo.add("Zebra");
		zoo.add("Lion");
		zoo.add("Tiger");
		ArrayList<String> list=new ArrayList();
		list.add("Hi");
		list.add("Hello");
		list.add("World");
		System.out.println("Before Copying zoo : " +zoo);
		System.out.println("Before Copying list : " +list);
		Collections.copy(list, zoo);
		System.out.println("After Copying zoo to list :" +list);
		
	}

}
/*
o/p-
Before Copying zoo : [Zebra, Lion, Tiger]
Before Copying list : [Hi, Hello, World]
After Copying zoo to list :[Zebra, Lion, Tiger]
 */