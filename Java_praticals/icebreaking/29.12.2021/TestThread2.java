/* Assignment no 5*/
import java.util.concurrent.Executor;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ThreadPoolExecutor;  
import java.util.concurrent.TimeUnit;  
  
public class TestThread2 {  
   public static void main(final String[] arguments) throws InterruptedException {  
      Executor e = Executors.newCachedThreadPool();  
      e.execute(new Thread());  
      ThreadPoolExecutor pool = (ThreadPoolExecutor)e;  
      pool.shutdown();  
   }    
  
   static class Thread implements Runnable {  
      public void run() {  
         try {  
            Long duration = (long) (Math.random() * 5);  
            System.out.println("Running Thread!");  
            TimeUnit.SECONDS.sleep(duration);  
            System.out.println("Thread Completed");  
         } catch (InterruptedException ex) {  
            ex.printStackTrace();  
         }  
      }  
   }  
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\29.12.2021>javac TestThread2.java

C:\java programs\Java_Praticals\icebreaking\29.12.2021>java TestThread2
Running Thread!
Thread Completed
*/