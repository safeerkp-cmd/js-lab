import java.util.*;

class Employee{
	int eno;
	String ename;
	int esalary; 
		void read(){

			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Employee Number:");
			eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name:");
			ename=sc.nextLine();	
			System.out.println("Enter Employee Salary:");
			esalary=sc.nextInt();	
}
	void display(){
		System.out.println("Employee Number:"+eno);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esalary);
	}
}
class EmployeeSearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number of employee");
		int n =sc.nextInt();
		Employee e[] =new Employee[n];
		
		for(int i=0;i<n;i++){
			e[i] =new Employee();
			e[i].read();
		}
		int found=0;
		int pos =-1;
		System.out.println("enter a employee no to search");
		int key = sc.nextInt();
		for(int j = 0; j < n; j++){
		if(e[j].eno==key){
			found=1;
			pos=j;
			break;	
		}
		
		}
			if(found == 1){
			e[pos].display();
		}
		else{
			System.out.println("EMPLOYEE NOT EXSITED");
		}

	}

}