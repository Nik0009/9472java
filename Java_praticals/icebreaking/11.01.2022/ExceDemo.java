public class ExceDemo{
public static void main(String args[]){
int a[]=new int[2];
try{
System.out.println("Access elemnet three :" +a[3]);
}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("exception throws :" +e);
}
finally{
a[0]=6;
System.out.println("first elemnet value :" +a[0]);
System.out.println("the finally statement is executed");
}
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\11.01.2022>javac ExceDemo.java

C:\java programs\Java_Praticals\icebreaking\11.01.2022>java ExceDemo
exception throws :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
first elemnet value :6
the finally statement is executed

*/