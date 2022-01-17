import java.util.*;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y=0,z=-0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter three numbers:");
		System.out.println();
		x=obj.nextInt();
		y=obj.nextInt();
		z=obj.nextInt();
		int sum=x+y+z;
		System.out.println("sum of three numbers:"+sum);
		int div=x/y/z;
		System.out.println("divistion of three numbers:"+div);
		int prod=x*y*z;
		System.out.println("product of three numbers:"+prod);
		int avg=(x+y+z)/3;
		System.out.println("average of three numbers:"+avg);
		if(x>=y&&x>=z) {
			System.out.println("max number is:"+x);
		}else if(y>=x&&y>=z) {
			System.out.println("max number is:"+y);
		}else if(z>=x&&z>=y) {
			System.out.println("max number is:"+z);
		}
		if(x<=y&&x<=z) {
			System.out.println("min number is:"+x);
		}else if(y<=x&&y<=z) {
			System.out.println("min number is:"+y);
		}else if(z<=x&&z<=y) {
			System.out.println("min number is:"+z);
		}
		}
}
/*
sum of three numbers:6
divistion of three numbers:0
product of three numbers:6
average of three numbers:2
max number is:3
min number is:1
 */