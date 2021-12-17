class Employee
{
private int ID;
private String name;
private int age;
private static int nextId=1;

public Employee(String name,int age)
{
this.name = name;
this.age = age;
this.ID = nextId++;
}
public void show()
{
System.out.println
("Id="+ID+"\nName="+name+"\nAge="+age);
}
public void showNextId()
{
System.out.println
("Next employee id will be="+nextId);
}
}
class AssignmentNo4
{
public static void main(String []args)
{
Employee E=new Employee("GFG1",56);
Employee F=new Employee("GFG2",45);
Employee G=new Employee("GFG3",25);
E.show();
F.show();
G.show();
E.showNextId();
F.showNextId();
G.showNextId();
{ 
Employee X=new Employee("GFG4",23);
Employee Y=new Employee("GFG5",21);
X.show();
Y.show();
X.showNextId();
Y.showNextId();
}

E.showNextId();
}
}



/*
o/p-
C:\java programs\Java_Praticals\icebreaking\16.12.2021>javac AssignmentNo4.java

C:\java programs\Java_Praticals\icebreaking\16.12.2021>java AssignmentNo4
Id=1
Name=GFG1
Age=56
Id=2
Name=GFG2
Age=45
Id=3
Name=GFG3
Age=25
Next employee id will be=4
Next employee id will be=4
Next employee id will be=4
Id=4
Name=GFG4
Age=23
Id=5
Name=GFG5
Age=21
Next employee id will be=6
Next employee id will be=6
Next employee id will be=6
*/