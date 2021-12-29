/* Assignment no 1*/
public class Multithread1 extends Thread  
{  
   public void run()  
    {  
      try {  
          System.out.println("thread is executing now........");  
      } catch(Exception e) {  
      }   
    }  
    public static void main (String[] args) {  
        Multithread1 m1= new Multithread1();  
        m1.start();  
        m1.start();  
    }  
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\29.12.2021>javac Multithread1.java

C:\java programs\Java_Praticals\icebreaking\29.12.2021>java Multithread1
Exception in thread "main" thread is executing now........
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:793)
        at Multithread1.main(Multithread1.java:13)
*/