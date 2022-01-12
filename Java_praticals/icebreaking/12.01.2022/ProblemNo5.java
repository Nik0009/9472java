import java.util.*;
public class ProblemNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colour=new ArrayList<String>();
		colour.add("red");
		colour.add("blue");
		colour.add("green");
		colour.add("yellow");
		colour.add("pink");
		System.out.print("List Before Sort :" + colour);
		Collections.sort(colour);
		
		System.out.print("List After Sort :" + colour);
	}

}
/*
o/p-
List Before Sort :[red, blue, green, yellow, pink]
List After Sort :[blue, green, pink, red, yellow]
 */