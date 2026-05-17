import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}
class Circle implements Shape{
    
     double r;

    Circle(double r) {

        this.r = r;
    }
    
    
    public void area() {
        System.out.println("Area of Circle " +(3.14 * r * r));
    }
    public void perimeter(){
        System.out.println("Perimeter of Circle" + ( 2 * 3.14 * r));
    }
}
class Rectangle implements Shape{
     int l, b;

    Rectangle(int l, int b) {

        this.l = l;
        this.b = b;
    }
    public void area() {
        System.out.println("Area of Rectangle " + (l * b));
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle" + ( 2 * (l + b)));
    }
    
}
public class InterfaceProgram {
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle

        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        c.area();
        c.perimeter();

        // Rectangle

        System.out.println("Enter length of rectangle");
        int l = sc.nextInt();

        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();

        Rectangle rec = new Rectangle(l, b);

        rec.area();
        rec.perimeter();
    }
}
