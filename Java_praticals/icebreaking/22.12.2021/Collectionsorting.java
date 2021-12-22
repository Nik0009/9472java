import java.util.*;
public class Collectionsorting
{
public static void main(String[] args)
{
		
ArrayList<String> al = new ArrayList<String>();
al.add("Geeks For Geeks");
al.add("Friends");
al.add("Dear");
al.add("Is");
al.add("Superb");
Collections.sort(al);
System.out.println("List after the use of" +
" Collection.sort() :\n" + al);
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\22.12.2021>javac Collectionsorting.java

C:\java programs\Java_Praticals\icebreaking\22.12.2021>java Collectionsorting
List after the use of Collection.sort() :
[Dear, Friends, Geeks For Geeks, Is, Superb]
*/