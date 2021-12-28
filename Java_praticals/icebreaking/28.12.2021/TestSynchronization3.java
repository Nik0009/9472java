class Table1{
synchronized void printTable(int n){
for(int i=2;i<=6;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class TestSynchronization3{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(5);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(100);
}
};
t1.start();
t2.start();
}
}
/*
o/p:-
C:\java programs\Java_Praticals\icebreaking\28.12.2021>javac TestSynchronization3.java

C:\java programs\Java_Praticals\icebreaking\28.12.2021>java TestSynchronization3
5
10
15
20
25
100
200
300
400
500
*/