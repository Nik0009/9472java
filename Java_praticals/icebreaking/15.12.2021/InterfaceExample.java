/*  INTERFACE EXAMPLE  */

import java.io.*;

interface in1
{
final int c=9;

void display();
}

class InterfaceExample implements in1{

public void display()
{
System.out.println("Girl");
}
public static void main(String args[]){
InterfaceExample g=new InterfaceExample();
g.display();
System.out.println(c);
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\15.12.2021>javac InterfaceExample.java

C:\java programs\Java_Praticals\icebreaking\15.12.2021>java InterfaceExample
Girl
9
*/