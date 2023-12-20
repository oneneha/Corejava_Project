package oops;

public class Employee1 {
String Name;
int EmpId;
 private int Salary;

public void Display(){

System.out.println("The Employee name is" + Name);
System.out.println("The Employee name is" + EmpId);
System.out.println("The Employee name is" + Salary);
}

public  void SetSalary( int sal) {
this.Salary=sal;
}
//Default constructor
//Constructor name is same as class name
//Constructor should not have return type
public Employee1()
{
System.out.println("Inside default constructor");

}

//Parameterized constructor
public Employee1(String Name1,int EmpId1,int Salary1) {
	System.out.println("Inside param constuctor");
	
	this.Name=Name1;
	this.EmpId=EmpId1;
	this.Salary=Salary1;
	
}

}
