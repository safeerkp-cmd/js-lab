import java.util.Scanner;

class Publisher {
    String name;

    Publisher(String name) {
        this.name = name;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String name, String title, String author) {
        super(name);
        this.title = title;
        this.author = author;
    }

    void printDetails() {
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Literature extends Book {
    Literature(String name, String title, String author) {
        super(name, title, author);
    }

    @Override
    void printDetails() {
        System.out.println("--- Literature Book ---");
        super.printDetails();
    }
}

class Fiction extends Book {
    Fiction(String name, String title, String author) {
        super(name, title, author);
    }

    @Override
    void printDetails() {
        System.out.println("--- Fiction Book ---");
        super.printDetails();
    }
}

public class BookHierarchyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read details for Literature book
        System.out.println("Enter Literature book details:");
        System.out.print("Publisher: ");
        String pub1 = sc.nextLine();
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        Literature literature = new Literature(pub1, title1, author1);

        // Read details for Fiction book
        System.out.println("\nEnter Fiction book details:");
        System.out.print("Publisher: ");
        String pub2 = sc.nextLine();
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        Fiction fiction = new Fiction(pub2, title2, author2);

        // Choose category to display
        System.out.println("\nWhich category details do you want to see? (1: Literature, 2: Fiction)");
        int ch = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println();
        if (ch == 1) {
            literature.printDetails();
        } else if (ch == 2) {
            fiction.printDetails();
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
