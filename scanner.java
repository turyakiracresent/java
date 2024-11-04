import java.util.Scanner;
public class scanner {
    public static void main (String[] args){
        System.out.println("Enter first number: ");
        Scanner three = new Scanner(System.in);
        int num1=three.nextInt();
        System.out.println("Enter Second  number: ");
        int num2=three.nextInt();
        System.out.println("Enter first number: ");
        int num3=three.nextInt();
        int total=num1+num2+num3;
        System.out.println("The total is " + total );
    }
    
}