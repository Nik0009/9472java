import java.util.*;

class CollectionDemo{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("nikhil");
list.add("sham");
list.add("ram");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\12.01.2022>javac CollectionDemo.java

C:\java programs\Java_Praticals\icebreaking\12.01.2022>java CollectionDemo
nikhil
sham
ram
*/