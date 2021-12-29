/* Assignment no 6*/
class Testdaemon1 extends Thread{    
public void run(){  
          System.out.println("Running thread is daemon...");  
}  
public static void main (String[] args) {  
      Testdaemon1 td= new Testdaemon1();  
      td.start();  
      setDaemon(true);   
   }  
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\29.12.2021>javac Testdaemon1.java
Testdaemon1.java:8: error: non-static method setDaemon(boolean) cannot be referenced from a static context
      setDaemon(true);
      ^
1 error
*/