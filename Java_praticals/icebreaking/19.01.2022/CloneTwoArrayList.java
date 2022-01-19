import java.util.*;

public class CloneTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1=new ArrayList();
		arraylist1.add("Jio");
		arraylist1.add("Airtel");
		arraylist1.add("VI");
		System.out.print("ArrayList1:-"+arraylist1);
		System.out.println();
	
		ArrayList arraylist2=(ArrayList)arraylist1.clone();
		System.out.print("Clone ArrayList2:-"+arraylist2);
		
	}

}
/*
o/p-
ArrayList1:-[Jio, Airtel, VI]
Clone ArrayList2:-[Jio, Airtel, VI]
*/