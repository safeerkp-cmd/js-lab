import java.util.*;

class Main {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        int n;
        String temp;

        System.out.println("Enter number of strings");
        n = sc.nextInt();

        String str[] = new String[n];

        System.out.println("Enter strings");

        for (int i = 0; i < n; i++) {

            str[i] = sc.next();
        }

        // Sorting

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (str[i].compareTo(str[j]) > 0) {

                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        // Display

        System.out.println("Sorted strings are:");

        for (int i = 0; i < n; i++) {

            System.out.println(str[i]);
        }
    }
}