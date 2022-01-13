import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> v=new Stack<String>();
		v.push("blue");
		v.push("green");
		v.push("red");
		v.pop();
		Iterator<String> itr= v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
/*
o/p-
blue green
*/