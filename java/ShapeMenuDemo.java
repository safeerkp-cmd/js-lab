/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.Scanner;
interface Shape{
    void area();
    void perimeter();
}

class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of Circle:"+(3.14*(radius*radius)));
    }
    public void perimeter(){
        System.out.println("perimeter of Circle:"+(2*3.14*radius));
    }
}

class Rectangle implements Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
    public void area(){
        System.out.println("Area of Rectangle:"+(length*breadth));
    }
    
    public void perimeter(){
        System.out.println("perimeter of Rectangle:"+(2*(length+breadth)));
    }
}

public class ShapeMenuDemo{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Exit");
        System.out.println();
        while(true){
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the radius");
                    int radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.println("Enter the length");
                    int length=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the breadth");
                    int breadth=sc.nextInt();
                    sc.nextLine();
                    
                    Rectangle r = new Rectangle(length,breadth);
                    r.area();
                    r.perimeter();
                    break;
                case 3:
                    return;
            }
        }
        
        
        
    }
}
