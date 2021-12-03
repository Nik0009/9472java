/* 1. When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
consider  i =20 
*/

public class ContinueExample2
{
    public static void main(String[] args) 
    {
     //  for(int i=20;i>=0;i--)
	for(int i=0;i<=20;i++)
       {
          if((i==7)||(i==15))
	  {
             continue;
          }
            else
	    {
              System.out.println(i);
            }
       }
    }
         
}

/*

o/p-

C:\java programs>javac ContinueExample2.java

C:\java programs>java ContinueExample2
0
1
2
3
4
5
6
8
9
10
11
12
13
14
16
17
18
19
20
*/
