/*
2. Write a program in Java to display the cube of the number upto given an integer. Go to the editor

Test Data
Input number of terms : 4
Expected Output :
                                             
Number is : 4 and cube of 4 is : 64

*/

import java.util.Scanner;
public class CubeExample
{
    public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Test Data");
       		System.out.print("Input number of terms :");
        	long num=sc.nextLong();
		System.out.println("Expected Output :");
        	long cube=(num*num*num);
        	System.out.println("Number is : "+num+"  and cube of "+num+" is "+cube);
	}
}

/*
o/p-

C:\java programs\Java_Praticals>javac CubeExample.java

C:\java programs\Java_Praticals>java CubeExample
Test Data
Input number of terms :4
Expected Output :
Number is : 4  and cube of 4 is 64 
*/