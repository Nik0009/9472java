import java.util.*;
import java.util.stream.Collectors;
class Name{
int id;
String name;
float age;
public void Age(int id, String name, float age) {
this.id = id;
this.name = name;
this.age = age;
}
}
public class JavaStreamExample {
public static void main(String[] args) {
List<Age> ageList = new ArrayList<Age>();
ageList.add(new Age(1,"Ram",22f));
ageList.add(new Age(2,"Shyam",24f));
ageList.add(new Age(3,"Pradip",32f));
ageList.add(new Age(4,"Dilip",43f));
List<Float> ageList3 = ageList.stream()
.filter(a-> a.age > 32
.map(a->a.age)
.collect(Collectors.toList());
System.out.println(ageList3);
}
}

/*
o/p-
[32]
*/
