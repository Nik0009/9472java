import java.util.Arrays;
import java.util.Collections;
public class GFG9{
public static void main(String[] args)
{
String arr[] = { "practice.geeksforgeeks.org",
"quiz.geeksforgeeks.org",
"code.geeksforgeeks.org" };
Arrays.sort(arr);
System.out.println("Modified arr[] : \n%s\n\n",
Arrays.toString(arr));
Arrays.sort(arr, Collections.reverseOrder());	
System.out.println("Modified arr[] : \n%s\n\n",
Arrays.toString(arr));
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\22.12.2021>javac GFG9.java
C:\java programs\Java_Praticals\icebreaking\22.12.2021>java GFG9
Modified arr[] : 

Modified arr[] : 
[quiz.geeksforgeeks.org, practice.geeksforgeeks.org, code.geeksforgeeks.org]
*/