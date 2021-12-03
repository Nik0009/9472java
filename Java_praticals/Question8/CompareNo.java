/*
8. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39	
*/

import java.util.Scanner;
public class CompareNo
{
 public static void main( String args[] )    
    { 
        Scanner input = new Scanner(System.in);
        int number1;  
        int number2;
        System.out.println( "Input Data: " ); 
        System.out.print( "Input first integer: " ); 
        number1 = input.nextInt(); 
        System.out.print( "Input second integer: " ); 
        number2 = input.nextInt();
	
	if ( number1 == number2 )   
	
            System.out.printf( "%d == %d\n", number1, number2 );  
	    
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
	    
        if ( number1 < number2 )          
	
            System.out.printf( "%d < %d\n", number1, number2 );  
	    
        if ( number1 > number2 )  
	
            System.out.printf( "%d > %d\n", number1, number2 );  
	    
        if ( number1 <= number2 )        
	
            System.out.printf( "%d <= %d\n", number1, number2 );  
	    
        if ( number1 >= number2 )          
	
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
}

/*
o/p-
C:\java programs\Java_Praticals>javac CompareNo.java

C:\java programs\Java_Praticals>java CompareNo
Input Data:
Input first integer: 25
Input second integer: 39
25 != 39
25 < 39
25 <= 39
*/
