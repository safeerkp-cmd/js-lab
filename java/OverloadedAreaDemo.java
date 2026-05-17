import java.util.*;

class area {
    double area(double r) {
        return 3.14 * r * r;
    }

    double area(double l, double br) {
        return l * br;
    }

    double area(float b, float h) {
        return 0.5 * b * h;
    }
}

public class OverloadedAreaDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area obj = new area();
        System.out.println("CHOOOSE UR OPTION :");
        System.out.println("1.CIRCLE :");
        System.out.println("2. SQUARE :");
        System.out.println("3. TRIANGLE :");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("ENTER THE RADIUS :");
                double r = sc.nextDouble();
                System.out.println("AREA OF CIRCLE ::" + obj.area(r));
                break;
            case 2:
                System.out.println("ENTER THE SIDES OF SQURE :");
                double l = sc.nextDouble();
                double br = sc.nextDouble();
                System.out.println("AREA OF SQAURE ::" + obj.area(l, br));
                break;
            case 3:
                System.out.println("ENTER THE SIDES OF SQURE :");
                double h = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("AREA OF SQAURE ::" + obj.area(h, b));

                break;
            default:
                System.out.println("invalid choice : ");
        }

    }
}
