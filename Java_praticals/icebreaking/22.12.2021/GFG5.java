class  GFG5{
public static void main(String args[])
{
byte b;
int i = 257;
double d = 323.142;
System.out.println("Conversion of int to byte.");
b = (byte)i;
System.out.println("i = " + i + " b = " + b);
System.out.println("\nConversion of double to byte.");
b = (byte)d;
System.out.println("d = " + d + " b= " + b);
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\22.12.2021>javac GFG4.java

C:\java programs\Java_Praticals\icebreaking\22.12.2021>java GFG4
Conversion of int to byte.
i = 257 b = 1

Conversion of double to byte.
d = 323.142 b= 67

*/