class AssignmentNo1
{
public static void main (String[] args)
{

int[] arr;

arr = new int[5];

arr[0] = 10;

arr[1] = 20;

arr[2] = 30;
arr[3] = 40;
arr[4] = 50;

for (int i = 0; i < arr.length; i++)
System.out.println("Element at index " + i +
" : "+ arr[i]);
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\16.12.2021>javac AssignmentNo1.java

C:\java programs\Java_Praticals\icebreaking\16.12.2021>java AssignmentNo1
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
*/