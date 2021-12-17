class AssignmentNo3{
public static void main(String[] args) {
 
 int i = (int)12.5f;
 
 System.out.println("(int)12.5f==" + i);
 
 float f = i;
 
 System.out.println("after float widening: " + f);
 
 System.out.print(f);
 f = f * i;
 
 System.out.println("*" + i + "==" + f);
 
 double d = Math.sin(f);

 System.out.println("Math.sin(" + f + ")==" + d);
 }
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\16.12.2021>javac AssignmentNo3.java

C:\java programs\Java_Praticals\icebreaking\16.12.2021>java AssignmentNo3
(int)12.5f==12
after float widening: 12.0
12.0*12==144.0
Math.sin(144.0)==-0.49102159389846933
*/