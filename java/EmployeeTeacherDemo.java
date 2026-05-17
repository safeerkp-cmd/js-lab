import java.util.*;

class Employee{
	int empId;
	String name;
	int salary;
	String address;
	Scanner sc = new Scanner(System.in);
	void reademployee(){

		System.out.println("enter employee id");
		empId=sc.nextInt();
		System.out.println("enter employee name");
		name=sc.next();

		System.out.println("enter employee salary");
		salary=sc.nextInt();
		System.out.println("enter employee address");
		sc.nextLine();
		address=sc.nextLine();
}
	void displayEmployee(){
		System.out.println("employeeDetailes");
			
		System.out.println("Id:" + empId);
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
		System.out.println("address:" + address);
}
}
class Teacher extends Employee{
		String department;
		String subject;
		Scanner sc = new Scanner(System.in);

	void readTeacher(){
		System.out.println("enter department no");
		department=sc.next();
		System.out.println("enter subject name");
		subject=sc.next();
	}
	void displayTeacher(){	
	System.out.println("department no:" + department);
	System.out.println(" subject name:" + subject );

	}
}
class tea{
public static void main(String [] arr){
Teacher t = new Teacher();
t.reademployee();
t.readTeacher();
t.displayEmployee();
t.displayTeacher();
}
}
