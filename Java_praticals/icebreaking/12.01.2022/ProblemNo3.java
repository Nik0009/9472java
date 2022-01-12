import java.util.*;

public class ProblemNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("red");
		list.add("blue");
		list.add("green");
		list.add("pink");
		list.add("black");
		list.add("white");
		System.out.println("Before :" +list);
		list.set(3, "yellow");
		System.out.println("After :" +list);
	}

}
/*
 o/p-
 Before :[red, blue, green, pink, black, white]
 After :[red, blue, green, yellow, black, white]

 */