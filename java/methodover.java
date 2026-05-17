import java.util.*;

class Shape{
	
	void area(int side){
		System.out.println("area of square" + side * side);
	}
	void area(int l , int b){
		System.out.println("area of rectangle" + l * b);

	
	}
	void area(double r){
		System.out.println("area of circle" + 3.14 * (r * r));

	
	}
}
class Main{
public static void main(String [] arr){
Shape sp = new Shape();

Scanner sc =new Scanner(System.in);

System.out.println("Enter side of square");
int side=sc.nextInt();
sp.area(side);

System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter bredth of rectangle");
int b=sc.nextInt();
sp.area(l,b);

System.out.println("Enter radius of circle");
double r=sc.nextDouble();
sp.area(r);




}

}