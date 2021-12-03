/*
9.. Write a Java program to reverse a word. 
Sample Output:

Input a word: dsaf
Reverse word: fasd
*/

import java.util.*;
public class ReverseWord
{
     public static void main(String[] args)
     {	
     	Scanner in = new Scanner(System.in);
    	System.out.print("\nInput a word: ");
	String word = in.nextLine();
	word = word.trim();
	String result = ""; 
	char[] ch=word.toCharArray();  
	
	for (int i = ch.length - 1; i >= 0; i--)
	{
		 result += ch[i];
	}
	System.out.println("Reverse word: "+result.trim());
     }			
}
/*
o/p-
C:\java programs\Java_Praticals>javac ReverseWord.java

C:\java programs\Java_Praticals>java ReverseWord

Input a word: dsaf
Reverse word: fasd
*/
