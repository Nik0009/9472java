public class TestDeadlockDemo {
public static void main(String[] args) {
final String resource1 = "monday";
final String resource2 = "sunday";
Thread t1 = new Thread() {
public void run() {
synchronized (resource1) {
System.out.println("Thread 1: resource 1 locked");
try { Thread.sleep(100);} catch (Exception e) {}
synchronized (resource2) {
System.out.println("Thread 1: resource 1 locked");
}
}
}
};
Thread t2 = new Thread() {
public void run() {
synchronized (resource2) {
System.out.println("Thread 2: resource 2 locked ");
try { Thread.sleep(200);} catch (Exception e) {}
synchronized (resource1) {
System.out.println("Thread 2: resource 1 locked ");
}
}
}
};
t1.start();
t2.start();
}
}
/*
o/p:-
C:\java programs\Java_Praticals\icebreaking\28.12.2021>javac TestDeadlockDemo.java

C:\java programs\Java_Praticals\icebreaking\28.12.2021>java TestDeadlockDemo
Thread 1: resource 1 locked
Thread 2: resource 2 locked
*/