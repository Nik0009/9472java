// package sortingarrays.sort;
import java.util.Arrays;
public class JavaArraySort {
public static void main(String[] args) {
int[] intArr = {6, 10, 9, 12, 8};
String[] strArr = {"I", "U", "A","E","O"};
Arrays.sort(intArr);
Arrays.sort(strArr);
System.out.println(Arrays.toString(intArr));
System.out.println(Arrays.toString(strArr));
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\06.01.2022>javac JavaArraySort.java

C:\java programs\Java_Praticals\icebreaking\06.01.2022>java JavaArraySort
[6, 8, 9, 10, 12]
[A, E, I, O, U]
*/