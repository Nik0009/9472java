import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
int rollno;
String name, address;

public Student(int rollno, String name, String address)
{
this.rollno = rollno;
this.name = name;
this.address = address;
}

public String toString()
{
return this.rollno + " " + this.name +
" " + this.address;
}
}
class Sortbyroll implements Comparator<Student>
{

public int compare(Student a, Student b)
{
return a.rollno - b.rollno;
}
}

class Main
{
public static void main (String[] args)
{
Student [] arr = {new Student(1, "A", "Nagpur"), new Student(2, "B", "Cpur"), new Student(3, "C", "Pune")};
System.out.println("Unsorted");
for (int i=0; i<arr.length; i++)
System.out.println(arr[i]);
Arrays.sort(arr, new Sortbyroll());
System.out.println("\nSorted by rollno");
for (int i=0; i<arr.length; i++)
System.out.println(arr[i]);
}
}

/* 
o/p-
C:\java programs\Java_Praticals\icebreaking\17.12.2021>javac Main.java

C:\java programs\Java_Praticals\icebreaking\17.12.2021>java Main
Unsorted
1 A Nagpur
2 B Cpur
3 C Pune

Sorted by rollno
1 A Nagpur
2 B Cpur
3 C Pune
*/
