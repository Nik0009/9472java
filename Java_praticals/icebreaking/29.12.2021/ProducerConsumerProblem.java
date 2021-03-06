/* Assignment no 3*/
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerProblem
{
    public static void main(String args[])
    {
        BlockingQueue sharedQueue = new LinkedBlockingQueue<>();
        
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));
        
        prodThread.start();
        consThread.start();
    }
}

class Producer implements Runnable
{
    private final BlockingQueue sharedQueue;
    
    public Producer(BlockingQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }
    
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                System.out.println("Produced: "+i);
                sharedQueue.put(i);
            }catch(InterruptedException e)
            {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}

class Consumer implements Runnable
{
    private final BlockingQueue sharedQueue;
    
    public Consumer(BlockingQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try {
                System.out.println("Consumed : "+sharedQueue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\29.12.2021>javac ProducerConsumerProblem.java
Note: ProducerConsumerProblem.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
*/