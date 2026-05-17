import java.util.*;

class Product {
		String pname;
		int pcode;
		int price;
	void read(){
		Scanner sc = new Scanner(System.in);
			 
		
		System.out.println("ENTER PRODUCT NAME");
		pname=sc.nextLine();
		System.out.println("ENTER PRODUCT Code");
		pcode=sc.nextInt();
		System.out.println("ENTER PRODUCT PRICE");
		price=sc.nextInt();


	}
	void display(){
		System.out.println("low price product");
		System.out.println("PRODUCT NAME" + pname);
		System.out.println("PRODUCT Code" + pcode);
		System.out.println("PRODUCT PRICE" + price);

	}
}
class Main{
public static void main(String arr []){
	
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = new Product();
	p1.read();
	p2.read();
	p3.read();
	if (p1.price < p2.price && p1.price < p3.price ){
	p1.display();
	}
	else if(p2.price < p1.price && p2.price < p3.price){
	p2.display();
	}
	else{
	p3.display();
	}
}

}	