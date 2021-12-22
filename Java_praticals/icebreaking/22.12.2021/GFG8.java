import java.util.Arrays;
public class GFG8 {
public static void main(String[] args)
{
		
int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
Arrays.sort(arr);
System.out.println("Modified arr[] : %s",
Arrays.toString(arr));
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\22.12.2021>javac GFG8.java
C:\java programs\Java_Praticals\icebreaking\22.12.2021>java GFG8
Modified arr[] : [6, 7, 9, 13, 21, 45, 101, 102]
*/