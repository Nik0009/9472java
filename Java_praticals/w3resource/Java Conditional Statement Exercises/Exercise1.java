/*
1. Write a Java program to get a number from the user and print whether it is positive or negative. 

Test Data
Input number: 35
Expected Output :
Number is positive

*/
import java.util.Scanner;
public class Exercise1 {
  public static void main(String[] args) {
  // Write your code here
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter one number=");
  int one=obj.nextInt();
  if(one>0){
    System.out.println(+one+" "+"number is positive" );
  }
  else{
    System.out.println(+one+" "+"number is negative ");
  }
 }
}
/* 
o/p-
Enter one number=
 2
2 number is positive
     or
Enter one number=
 -2
-2 number is negative*/