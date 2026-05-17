import java.util.*;

class Publisher{
Scanner sc = new Scanner(System.in);
String publisherName;

	void readPublisher(){

		System.out.println("enter publisher name");
		publisherName=sc.nextLine();
}
	void displayPublisher(){
		System.out.println("Publisher name:" + publisherName);
	}

}
class Books extends Publisher {
	Scanner sc = new Scanner(System.in);
	String bookName;
	int price;
	
	void ReadBook(){
		sc.nextLine();
		System.out.println("Enter BOOK Name");
		bookName=sc.nextLine();
		System.out.print("enter book price");
		price=sc.nextInt();

	}
	void DisplayBook(){
		System.out.println("book name " + bookName);
		System.out.println("Price" + price);
	}
	
}
class Literature extends Books{

	Scanner sc = new Scanner(System.in);
	String type;
	void Readtype(){

		System.out.println("enter type of book");
		type=sc.next();
	}
	void DisplayType(){

		System.out.println("book type " + type);

	}
}
class Fiction extends Books{ 

	Scanner sc = new Scanner(System.in);
	String genre;
	void ReadFiction (){

		System.out.println("enter type of genre");
		genre=sc.next();
	}
	void DisplayFiction (){

		System.out.println("book genre " + genre);
	}
}
class BookDetails{
	private static Literature l;

	public static void main(String[] args) {
		l = new Literature();
		Fiction f = new Fiction();
		l.readPublisher();
		l.ReadBook();
		l.Readtype();

		f.readPublisher();
		f.ReadBook();
		f.ReadFiction();

		l.displayPublisher();
		l.DisplayBook();
		l.DisplayType();

		f.displayPublisher();
		f.DisplayBook();
		f.DisplayFiction();
	}
}