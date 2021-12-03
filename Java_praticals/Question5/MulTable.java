/*
5. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;
public class MulTable
{
	public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a number: ");
	int userInput=sc.nextInt();
	System.out.println("Expexted Output:");
	for(int i=1;i<=10;i++)
		{
			int table=userInput*i;
			System.out.println(userInput+"*"+i+"="+table);
		}
	}
}
/*
o/p-
C:\java programs\Java_Praticals>javac MulTable.java

C:\java programs\Java_Praticals>java MulTable
Input a number:
8
Expexted Output:
8*1=8
8*2=16
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72
8*10=80
*/
