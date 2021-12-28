class Table{
synchronized void printTable(int n){
for(int i=1;i<=5;i++){
System.out.println(n*i);
try{
Thread.sleep(300);
}catch(Exception e){System.out.println(e);}
}
}
}
public class TestSynchronization{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(10);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(90);
}
};
t1.start();
t2.start();
}
}

/* 
o/p:-
C:\java programs\Java_Praticals\icebreaking\28.12.2021>javac TestSynchronization.java

C:\java programs\Java_Praticals\icebreaking\28.12.2021>java TestSynchronization

10
20
30
40
50
90
180
270
360
450
*/