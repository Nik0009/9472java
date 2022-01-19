import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("blue");
		v.add("green");
		v.add("red");
		Iterator<String> itr= v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}
/*
o/p-
blue green red
 */