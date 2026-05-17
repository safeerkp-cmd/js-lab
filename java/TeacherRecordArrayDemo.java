import java.util.Scanner;

class Employee{
    int empID;
    String eName;
    int eSalary;
    String eAddress;
    
}

class Teacher extends Employee{
    String department;
    String Subject;
    
    // super();
    
    Teacher(int empID,String eName,int eSalary,String eAddress,String department,String Subject){
        this.empID=empID;
        this.eName=eName;
        this.eSalary=eSalary;
        this.eAddress=eAddress;
        this.department=department;
        this.Subject=Subject;
    }
}


public class TeacherRecordArrayDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int no = sc.nextInt();
        
        Teacher[] teacher = new Teacher[no];
        
        for(int i=0;i<no;i++){
            System.out.println("Enter the employee ID:");
            int empID = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the employee name:");
            String eName=sc.nextLine();
            System.out.println("Enter the employee salary:");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the employee address:");
            String address = sc.nextLine();
            System.out.println("Enter the department:");
            String department=sc.nextLine();
            System.out.println("Enter the Subject");
            String subject  = sc.nextLine();
            
            teacher[i]=new Teacher(empID,eName,salary,address,department,subject);
            
        }
        
        for(int j=0;j<no;j++){
            System.out.println("Teacher "+(j+1));
            System.out.println();
            System.out.println("Employee ID:"+teacher[j].empID);
            System.out.println("Employee Name:"+teacher[j].eName);
            System.out.println("Employee salary:"+teacher[j].eSalary);
            System.out.println("Employee Adderss:"+teacher[j].eAddress);
            System.out.println("Employee department:"+teacher[j].department);
            System.out.println("Employee Subject:"+teacher[j].Subject);
            
            System.out.println();
        }
    }
}
