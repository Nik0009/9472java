public class MutableDemo {
private String name;
MutableDemo(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public static void main(String[] args) {
MutableDemo obj = new MutableDemo("hello");
System.out.println(obj.getName());

obj.setName("new hello");
System.out.println(obj.getName());
}
}

/*
o.p-
C:\java programs\Java_Praticals\icebreaking\03.01.2022>javac MutableDemo.java

C:\java programs\Java_Praticals\icebreaking\03.01.2022>java MutableDemo
hello
new hello
*/