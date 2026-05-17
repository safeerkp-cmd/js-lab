import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double academicScore;

    void inputStudent(Scanner sc) {
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter academic score: ");
        academicScore = sc.nextDouble();
    }

    void displayStudent() {
        System.out.println("Roll number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Academic score: " + academicScore);
    }
}

interface Sports {
    double getSportsScore();
    void setSportsScore(double score);
}

class Result extends Student implements Sports {
    double sportsScore;

    @Override
    public double getSportsScore() {
        return sportsScore;
    }
    @Override
    public void setSportsScore(double score) {
        this.sportsScore = score;
    }

    void inputResult(Scanner sc) {
        inputStudent(sc);
        System.out.print("Enter sports score: ");
        sportsScore = sc.nextDouble();
    }

    void displayResult() {
        displayStudent();
        System.out.println("Sports score: " + sportsScore);
    }
}

public class StudentAcademicSportsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result studentResult = new Result();
        studentResult.inputResult(sc);
        System.out.println("\n--- Student Academic and Sports Details ---");
        studentResult.displayResult();
        sc.close();
    }
}
