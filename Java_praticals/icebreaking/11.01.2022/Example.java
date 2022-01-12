import java.io.*;

public class Example{
public static void main(String args[]){
try{
int[] a=new int[2];
System.out.println(" Element three:"+a[3]);
}
catch(Exception e)
{
System.out.println(" Exception thrown:"+e);
}
System.out.println("out of the block");
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\11.01.2022>javac Example.java

C:\java programs\Java_Praticals\icebreaking\11.01.2022>java Example
 Exception thrown:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
out of the block
*/