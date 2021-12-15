/*    RUNTIME POLYMORPHISM EXAMPLE    */

class A{
public void dis(){
System.out.println("I am within class A");
}
}
class B extends A{
public void dis(){
System.out.println("I am within class B");
}
}
public class RunTimePolymorphismEample{
public static void main(String args[]){
A ob1=new A();
A ob2=new B();
ob1.dis();
ob2.dis();
}
}

/* 
o/p-
C:\java programs\Java_Praticals\icebreaking\15.12.2021>javac RunTimePolymorphismEample.java

C:\java programs\Java_Praticals\icebreaking\15.12.2021>java RunTimePolymorphismEample
I am within class A
I am within class B

*/