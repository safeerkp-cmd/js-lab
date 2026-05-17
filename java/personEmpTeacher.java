import java.util.*;
class Person{
Scanner sc = new Scanner(System.in);
String name;
String gender;
String address;
int age;
	void readPerson(){

		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter gender");
		gender=sc.nextLine();

		System.out.println("enter address");
		address=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
}
	void displayPerson(){
		
			
		
		System.out.println("name:" + name);
		System.out.println("Gender " + gender);
		System.out.println("address:" + address);
		System.out.println("age " + age);
		
}


}
class Employee extends Person{
	int empId;
	int salary;
	Scanner sc = new Scanner(System.in);
	void reademployee(){

		System.out.println("enter employee id");
		empId=sc.nextInt();
		

		System.out.println("enter employee salary");
		salary=sc.nextInt();
}
		
	void displayEmployee(){
		System.out.println("employeeDetailes");
			
		System.out.println("Id:" + empId);
		
		System.out.println("salary:" + salary);
		
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
class Main{
public static void main(String [] arr){
Teacher t = new Teacher();
t.readPerson();
t.reademployee();
t.readTeacher();
t.displayPerson();
t.displayEmployee();
t.displayTeacher();
}
}