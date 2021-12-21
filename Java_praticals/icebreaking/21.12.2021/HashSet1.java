import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
 
    HashSet<String> set=new HashSet();  
           set.add("ten");    
           set.add("Twenty");    
           set.add("Thirty");   
           set.add("Fourty");  
           set.add("Fifty");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\21.12.2021>javac HashSet1.java
C:\java programs\Java_Praticals\icebreaking\21.12.2021>java HashSet1
ten
Twenty
Thirty
Fourty
Fifty

*/