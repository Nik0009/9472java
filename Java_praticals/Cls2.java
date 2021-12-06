/* Java Inheritance
Input:
The input line contains T, denotes the number of testcase. Each testcase contains one line containing a and b separated by space.

Output:
For each testcase in new line, print the required answer.

Constraints:
1 <= T <= 100
1 <= a, b <= 103

Example:
Input:
1
2 4

Output:
6
8
20

Explanation:
Testcase 1: Output contains 3 lines:
In 1st line sum of two numbers is printed from the method add().
In 2nd line multiplication of two nos is printed from the method mul().
In 3rd line sum of the sqaures of the two nos is printed using your created method task().
*/

import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}

public class Sol{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        //String tilde=sc.next();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
        //System.out.println("~");
        }
    }
}


 // } Driver Code Ends
//User function Template for Java
class Cls2 extends Cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int p,int q)
    {
        //Add your code here.
         System.out.println(p*p+q*q);
    }
}

/*
o/p-
For Input:
1
2 4



Your Output: 
6
8
20
*/