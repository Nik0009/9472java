public class ThrowDemo1{
static void validate(int age){
if(age<22)
throw new ArithmeticException("invalid");
else
System.out.println("welcome aboard");
}
public static void main(String args[]){
validate(19);
System.out.println("code remainder");
}
}
/*
o/p-
C:\java programs\Java_Praticals\icebreaking\31.12.2021>javac ThrowDemo1.java

C:\java programs\Java_Praticals\icebreaking\31.12.2021>java ThrowDemo1
Exception in thread "main" java.lang.ArithmeticException: invalid
        at ThrowDemo1.validate(ThrowDemo1.java:4)
        at ThrowDemo1.main(ThrowDemo1.java:9)
*/