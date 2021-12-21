import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ram");  
  al.add("raju");  
  al.add("rani");  
  al.add("soni");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\21.12.2021>javac LinkedList1.java

C:\java programs\Java_Praticals\icebreaking\21.12.2021>java LinkedList1
Ram
raju
rani
soni
*/