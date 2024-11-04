import java.util.*;
public class ProductAndSum {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        int num1,num2,product,sum,name;
        System.out.println("Enter first number: ");
        //num1 assigned to num
        num1 = num.nextInt();
        System.out.println("Enter second number: ");
        num2= num.nextInt();
        product=num1*num2;
        sum=num1+num2;
        System.out.println("Product is: "+ product);
        System.out.println("Sum is: "+ sum);
        
        
        num.close();
        
        
    }
    
}