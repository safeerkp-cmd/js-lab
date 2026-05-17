import java.util.*;

class Complex {

    int real;
    int img;

    void read() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part");
        real = sc.nextInt();

        System.out.println("Enter imaginary part");
        img = sc.nextInt();
    }

    void add(Complex c1, Complex c2) {

        real = c1.real + c2.real;
        img = c1.img + c2.img;
    }

    void display() {

        System.out.println("Sum = " + real + " + " + img + "i");
    }
}

class Main {

    public static void main(String arr[]) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.println("Enter first complex number");
        c1.read();

        System.out.println("Enter second complex number");
        c2.read();

        c3.add(c1, c2);

        c3.display();
    }
}