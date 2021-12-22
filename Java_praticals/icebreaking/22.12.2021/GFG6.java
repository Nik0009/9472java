class GFG6{
public static void main(String args[])
{
byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = .1234;
double result = (f * b) + (i / c) - (d * s);
System.out.println("result = " + result);
}
}

/*
C:\java programs\Java_Praticals\icebreaking\22.12.2021>javac GFG6.java

C:\java programs\Java_Praticals\icebreaking\22.12.2021>java GFG6
result = 626.7784146484375
*/