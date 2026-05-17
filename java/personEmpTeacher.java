import java.util.Scanner;

class Employee {
    int empID;
    String eName;
    int eSalary;
    String eAddress;
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empID, String eName, int eSalary, String eAddress, String department, String subject) {
        this.empID = empID;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eAddress = eAddress;
        this.department = department;
        this.subject = subject;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int no = sc.nextInt();
        sc.nextLine();

        Teacher[] teacher = new Teacher[no];

        for (int i = 0; i < no; i++) {
            System.out.println("Enter details of employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empID = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String eName = sc.nextLine();

            System.out.print("Employee Salary: ");
            int eSalary = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Address: ");
            String eAddress = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teacher[i] = new Teacher(empID, eName, eSalary, eAddress, department, subject);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < no; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("ID: " + teacher[i].empID);
            System.out.println("Name: " + teacher[i].eName);
            System.out.println("Salary: " + teacher[i].eSalary);
            System.out.println("Address: " + teacher[i].eAddress);
            System.out.println("Department: " + teacher[i].department);
            System.out.println("Subject: " + teacher[i].subject);
            System.out.println();
        }

        sc.close();
    }
}
