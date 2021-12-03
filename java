1. When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
consider  i =20

solution:-

public class ContinueExample
{
    public static void main(String[] args) 
    {
       for(int i=20;i>=0;i--)
       {
          if((i==7)||(i==15))
	  {
             continue;
          }
            else
	    {
              System.out.println(i);
            }
       }
    }
         
}


2. Write a program in Java to display the cube of the number upto given an integer. Go to the editor

Test Data
Input number of terms : 4
Expected Output :
                                             
Number is : 4 and cube of 4 is : 64

solution:-

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
