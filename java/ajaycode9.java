import java.util.Scanner;
class Employee{
    int eNo;
    String eName;
    int eSalary;
    
    Employee(int eNo,String eName,int eSalary){
        this.eNo=eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    
}


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int no = sc.nextInt();
        
        Employee[] eObj = new Employee[no];
        
        
        for(int i=0;i<no;i++){
            System.out.println("Enter the Employee Code");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name");
            String eName = sc.nextLine();
            System.out.println("Enter the Employee Salary");
            int eSalary = sc.nextInt();
            
            eObj[i]= new Employee(eNo,eName,eSalary);
        }
        
        int eNo = sc.nextInt();
        
        for(int i=0;i<no;i++){
            if(eObj[i].eNo==eNo){
                System.out.println(eObj[i].eNo);
                System.out.println(eObj[i].eName);
                System.out.println(eObj[i].eSalary);
            }
        }
        
    }
}
