import java.util.*;

public class IsAListEmptyOrNotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List=new ArrayList();
		List.add("Sham");
		List.add("Ram");
		List.add("Joy");
		System.out.print("ArrayList :-"+List);
		System.out.println();
		
		if(List.isEmpty()) {
			System.out.print("ArrayList is Empty.");
		}else {
			System.out.print("ArrayList is not Empty");
		}
	}

}
/*
o/p-
ArrayList :-[Sham, Ram, Joy]
ArrayList is not EmptyArrayList is not Emp
*/