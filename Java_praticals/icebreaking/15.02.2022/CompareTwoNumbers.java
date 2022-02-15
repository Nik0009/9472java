import java.util.Scanner;


public class CompareTwoNumbers {

	public static void main(String args[])
	{
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two numbers:-");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(num1==num2) {
			
			//System.out.println("two numbers are equal.");
			System.out.println("num1=num2");
		}
		if(num1!=num2) {
			
			//System.out.println("two numbers are not equal.");
			System.out.println("num1!=num2");
		}
		if(num1<num2) {
			
			//System.out.println("first number is greater than second number.");
			System.out.println("num1<num2");
			
		}else {
			{
				//System.out.println("second nuber is grater than first number.");
				System.out.println("num2>num1");
			}
		}
				
	}
}
