public class Program{
public static void main(String args[]){ 
Object[] elements=new Object[4];
elements[0]="Dog";
elements[1]=70;
elements[2]=new StringBuilder("bcd");
elements[3]=6;
for(Object e:elements){
System.out.println(e);
}
}
}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\17.12.2021>javac Program.java

C:\java programs\Java_Praticals\icebreaking\17.12.2021>java Program
Dog
70
bcd
6
*/