import java.util.*;
class Cpu{
Scanner sc =new Scanner(System.in); 
class Processor{
	
	int noOfCores;
	String manufacturer;
	void entry(){
	System.out.println("Processor Details");
	System.out.println("enter no of cores");
	noOfCores=sc.nextInt();
	System.out.println("enter manufacturer name");
	manufacturer=sc.next();
	
	}
	void displayProcessor(){
		System.out.println(noOfCores);
		System.out.println(manufacturer);

	}
}
class Ram{
	int memory;
	String manufacturer;
	void entryram(){
	System.out.println("enter memory Space");
	memory=sc.nextInt();
	System.out.println("enter manufacturer name");
	manufacturer=sc.next();
	}
	void displayRam(){
		System.out.println("Ram Details");

		System.out.println(memory);
		System.out.println(manufacturer);

		}
	}

}
class Main{
public static void main(String arr[]){
	
Cpu cpu =new Cpu();
Cpu.Processor p = cpu.new Processor();
Cpu.Ram r = cpu.new Ram();
p.entry();
p.displayProcessor();
r.entryram();
r.displayRam();
}
}