/*
3. Write a Java program that takes two numbers as input and display the product of two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
import java.util.Scanner;
public class ProductExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Test Data");
        int num1;
        int num2;
        System.out.print("Input First number :");
        num1=sc.nextInt();
        System.out.print("Input Second number :");
        num2=sc.nextInt();

        int product=num1*num2;
	System.out.println("Expected Output :");
        System.out.println(num1+"*"+num2+"="+product);
        
    }
}
/*o/p-

C:\java programs\Java_Praticals>javac ProductExample.java

C:\java programs\Java_Praticals>java ProductExample
Test Data
Input First number :25
Input Second number :5
Expected Output :
25*5=125
*/
