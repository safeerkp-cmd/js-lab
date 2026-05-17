import java.util.*;

class Student{

    Scanner sc =new Scanner(System.in);
    int rollNo;
    int mark;
    void readStudent(){
        System.out.println("enter student roll no");
        rollNo=sc.nextInt();
        System.out.println("Enter student mark");
        mark=sc.nextInt();
    }
    void displayStudent(){
        System.out.println("roll no:" + rollNo );
        System.out.println("mark:" + mark);
    }

}
class Sports{
     Scanner sc =new Scanner(System.in);
     int sportsMark;

     void readSports(){

        System.out.println("enter sports mark");
        sportsMark=sc.nextInt();
     }
     void displaySports(){
         System.out.println("sports mark:" + sportsMark);

     }
}
class Result extends Student{
    Sports s1 = new Sports();
    
    void displayResult(){
       
        int totalMark=s1.sportsMark+mark;
        
       
        System.out.println("Total Mark of the student" + totalMark );
    }
    
    
}
class Main{
    public static void main(String[] args) {
        Result r = new Result();
       

       r.displayStudent();
        r.s1.displaySports();
        r.displayResult();
    }
}