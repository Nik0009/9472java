public final class ImmutableDemo {
private String name;
ImmutableDemo (String name) {
this.name = name;
}
public String getName() {
return name;
}

public static void main(String[] args) {
ImmutableDemo obj = new ImmutableDemo("hello");
System.out.println(obj.getName());
/* obj.setName("new hello");
System.out.println(obj.getName());
*/
}

}

/*
o/p-
C:\java programs\Java_Praticals\icebreaking\03.01.2022>javac ImmutableDemo.java

C:\java programs\Java_Praticals\icebreaking\03.01.2022>java ImmutableDemo
hello
*/