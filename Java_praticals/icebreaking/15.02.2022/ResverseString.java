import java.util.*;

public class ResverseString {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:");
		char[] ch=scanner.nextLine().toCharArray();
		for (int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
	}
}
