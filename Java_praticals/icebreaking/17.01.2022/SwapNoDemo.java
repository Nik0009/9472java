import java.util.*;

public class SwapNoDemo {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter two numbers");
		System.out.println();
		x=obj.nextInt();
		y=obj.nextInt();
		System.out.print("Before swapping :"+x+" "+y);
		System.out.println();
		int t=x;
		x=y;
		y=t;
		System.out.print("After Swapping:"+x+" "+y);
		System.out.println();
		
	}

}
/*
 Enter two numbers
1 2
Before swapping :1 2
After Swapping:2 1
 */