import java.util.*;

public class MultiTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x;
		System.out.println("Enter a number for table:");
		Scanner obj=new Scanner(System.in);
		x=obj.nextInt();
		for(int i=0;i<=10;i++) {
			int y=x*i;
			System.out.println(+x+"*"+i+"="+y);
		}
	}

}
/*
o/p-
Enter a number for table:
2
2*0=0
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
*/