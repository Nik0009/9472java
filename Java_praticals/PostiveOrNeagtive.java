/*6. Write a Java program to get a number from the user and print whether it is positive or negative. 

Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;
public class PostiveOrNeagtive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Test Data");
		System.out.print("Input number: ");
		int i=sc.nextInt();
		System.out.println("Expected Output :");
		if(i<0)	
		{
			System.out.println("Number is negative");
		}
		else if(i>0)
		{
			System.out.println("Number is possitive");
		}
		else
		{
			System.out.println("no is zero");
		}
	}
}

/*
o/p-
C:\java programs\Java_Praticals>javac PostiveOrNeagtive.java

C:\java programs\Java_Praticals>java PostiveOrNeagtive
Test Data
Input number: 35
Expected Output :
Number is possitive
*/