import java.util.*;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("blue");
		list.add("green");
		list.add("red");
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
/*
o/p-
blue green red
 */