import java.util.Scanner;
public class studentDetails {
    public static void main (String[] args){
      Scanner student= new Scanner(System.in);
       System.out.println("Enter your reg number: ");
        String reg=student.next();
        System.out.println("Enter your name: ");
        String name=student.next();
        System.out.println("Enter your age: ");
        int age= student.nextInt();
        System.out.println("Enter your course: ");
        String course= student.next();
        System.out.println("Enter your of study: ");
        int yr=student.nextInt();
        System.out.println("Enter your academic year: ");
        String ac= student.next();
        
    }
}