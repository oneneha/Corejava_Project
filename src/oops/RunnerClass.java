package oops;

public class RunnerClass {

	public static void main(String[] args) {
		Employee1 emp1=new Employee1();
		emp1.Name="Neha";
		emp1.EmpId=100;
		emp1.SetSalary(50000);
		
		
		Employee1 emp2=new Employee1();
		emp2.Name="Shankar";
		emp2.EmpId =200;
		emp2.SetSalary(60000);
		
		Employee1 emp3=new Employee1("Rashmi",101,40000);
		
		emp1.Display();
		emp2.Display();
		emp3.Display();
		
		
		ICICIBank obj1=new ICICIBank();
		
		obj1.AccNo=333;
		obj1.BankId=222;
		
		HDFCBank obj2=new HDFCBank();
		obj2.Accountno=456;
		
		
		

	}

}
