class Example2{
public static void main(String args[]){
int a[][]={{9,8,7},{6,5,4},{3,2,1}};
System.out.println("Enter Elements of array:");

for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
System.out.println(a[i][j]);
}
System.out.println();
}
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\14.12.2021>javac Example2.java

C:\java programs\Java_Praticals\icebreaking\14.12.2021>java Example2
Enter Elements of array:
9
8
7

6
5
4

3
2
1
*/