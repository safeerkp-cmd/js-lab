import java.util.Scanner;

class Person{
    String name;
    String gender;
    String address;
    int age;
    
    Person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}

class Employee extends Person{
    int empid;
    String company_name;
    String qualification;
    int salary;
    
    Employee(String name,String gender, String address, int age, int empid,String company_name,String qualification,int salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.company_name=company_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}



class Teacher extends Employee{
    int Teacherid;
    String department;
    String subject;
    Teacher(String name,String gender, String address, int age, int empid,String company_name,String qualification,int salary,int Teacherid,String department,String subject){
        super(name,gender,address,age,empid,company_name,qualification,salary);
        this.Teacherid=Teacherid;
        this.department=department;
        this.subject=subject;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int no = sc.nextInt();
        
        Teacher[] teacher = new Teacher[no];
        
        for(int i=0;i<no;i++){
            System.out.println("Enter the name:");
            String name= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the Gender:");
            String gender= sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the Address:");
            String address= sc.nextLine();
            System.out.println("Enter the Age:");
            int age= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the empid:");
            int empid= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Company:");
            String company = sc.nextLine();
            System.out.println("Enter the qualification:");
            String qualification = sc.nextLine();
            System.out.println("Enter the salary:");
            int salary= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the teacher id:");
            int techerid= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the department");
            String department = sc.nextLine();
            System.out.println("Enter the subject");
            String subject = sc.nextLine();
            
            teacher[i]=new Teacher(name,gender,address,age,empid,company,qualification,salary,techerid,department,subject);
        }
        
        for(int j=0;j<no;j++){
            System.out.println(teacher[j].name);
            System.out.println(teacher[j].gender);
            System.out.println(teacher[j].address);
            System.out.println(teacher[j].age);
            System.out.println(teacher[j].empid);
            System.out.println(teacher[j].company_name);
            System.out.println(teacher[j].qualification);
            System.out.println(teacher[j].salary);
            System.out.println(teacher[j].Teacherid);
            System.out.println(teacher[j].department);
            System.out.println(teacher[j].subject);
            System.out.println();
            System.out.println();

        }
    }
}
