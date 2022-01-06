import java.util.Arrays;
public class JavaSortingDemo
{
public static void main(String[] args)
{
Integer[] numbers = new Integer[] { 18, 19, 13, 12, 15, 17, 16 };
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\06.01.2022>javac JavaSortingDemo.java

C:\java programs\Java_Praticals\icebreaking\06.01.2022>java JavaSortingDemo
[12, 13, 15, 16, 17, 18, 19]

*/